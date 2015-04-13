import org.grailsseed.auth.Role
import org.grailsseed.auth.User
import org.grailsseed.auth.UserRole

class BootStrap {

    def init = { servletContext ->

        def userRole = Role.findByAuthority('ROLE_USER') ?: new Role(authority: 'ROLE_USER').save(failOnError: true)
        def apiRole = Role.findByAuthority('ROLE_API') ?: new Role(authority: 'ROLE_API').save(failOnError: true)
        // Enables access to /appname/user
        def accountGranterRole = Role.findByAuthority('ROLE_ACCOUNT_GRANTER') ?: new Role(authority: 'ROLE_ACCOUNT_GRANTER').save(failOnError: true)

        // Enables access to everything
        def adminRole = Role.findByAuthority('ROLE_ADMIN') ?: new Role(authority: 'ROLE_ADMIN').save(failOnError: true)

        def adminUser = User.findByUsername('admin') ?: new User(
                username: 'admin',
                password: 'admin',
                enabled: true).save(failOnError: true)

        if (!adminUser.authorities.contains(adminRole)) {
            UserRole.create adminUser, adminRole
        }

        log.info "Created user admin/admin."
    }
    def destroy = {
    }
}

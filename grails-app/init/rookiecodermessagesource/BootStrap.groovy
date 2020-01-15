package rookiecodermessagesource

class BootStrap {
    def messageSource

    def init = { servletContext ->
        println messageSource
    }
    def destroy = {
    }
}

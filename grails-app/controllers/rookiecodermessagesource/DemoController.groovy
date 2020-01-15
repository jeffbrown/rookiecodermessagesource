package rookiecodermessagesource

class DemoController {

    def messageSource

    def index() {
        render "messageSource is an instance of ${messageSource?.class}"
    }
}

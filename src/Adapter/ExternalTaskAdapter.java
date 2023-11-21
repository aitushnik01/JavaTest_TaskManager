package Adapter;

// Adapter to make ExternalTaskService compatible with the internal Task interface
class ExternalTaskAdapter implements ExternalTask {
    private ExternalTaskService externalTaskService;

    public ExternalTaskAdapter(ExternalTaskService externalTaskService) {
        this.externalTaskService = externalTaskService;
    }

    @Override
    public void fetchExternalTaskDetails() {
        externalTaskService.getTaskDetailsFromExternalService();
    }
}

package com.adolfo.gamer.flow.business;
@Component
class BusinessService{
    @Autowired
    private DataService dataService;
    public long calculateSum(){
        List<Integer> data = dataService.retrieveData();
        return data.stream().reduce(Integer::sum).get();
    }
}
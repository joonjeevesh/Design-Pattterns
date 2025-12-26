package org.example.structural.facade;

import org.example.structural.facade.Service.AnalyticsService;
import org.example.structural.facade.Service.InventoryService;
import org.example.structural.facade.Service.PaymentService;
import org.example.structural.facade.Service.RecommendationService;

//facade class as it helps in keeping orderManager class nice and clean
public class OrderProcessor {
    WarehouseProcessor warehouseProcessor;
    private AnalyticsService analyticsService;
    private RecommendationService recommendationService;

    public void process() {
        warehouseProcessor.process();
        analyticsService.track();
        recommendationService.updateRecommendations();
    }
}

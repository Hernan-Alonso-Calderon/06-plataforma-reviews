package org.example.controllers.restaurant;

import org.example.controllers.IControllerCommand;
import org.example.services.RestaurantService;
import org.example.utils.IHandler;

public class AddRestaurantControllerCommand implements IControllerCommand {
  private final IHandler handler;
  private final RestaurantService restaurantService;

  public AddRestaurantControllerCommand(IHandler handler, RestaurantService restaurantService) {
    this.handler = handler;
    this.restaurantService = restaurantService;
  }

  @Override
  public void execute() {
    handler.writeLine("Ingrese el nombre del restaurante");
    String name = handler.readLine();
    handler.writeLine("Ingrese el teléfono");
    String phone = handler.readLine();
    handler.writeLine("Ingrese la descripción");
    String description = handler.readLine();
    this.restaurantService.addRestaurant(name, phone, description);
  }
}
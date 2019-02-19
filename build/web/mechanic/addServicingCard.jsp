
<%@page contentType="text/html" pageEncoding="UTF-8"%>

<%@ include file="../mechanic/layouts/header.html" %>


            <div class="content">
                <div class="container-fluid">
                    <div class="row">

                        <div class="col-md-12">
                            <div class="card ">
                                <div class="card-header ">
                                    <h4 class="card-title"> Checklist</h4>
                                    <p class="card-category"> WorkOrder checklist</p>
                                </div>
                                <div class="card-body ">
                                    <form method="post" action="addServicingCard">
                                    
                                    <input name="work_order_id" type="hidden" value="<%= request.getAttribute("work_order_id") %>"/>
                                   

                                           <table class="table table-responsive ">
                                        
                                        <thead>
                                            <tr>
                                                
                                               
                                                <th>Item</th>
                                        <th>Checkbox</th>
                                          
                                            </tr>
                                        </thead>
                                        <tbody>
                                           
                                            <tr>
                                                <td>Engine Oil Change</td>
                                                <td><input type="checkbox" name="engine_oil_change"></td>
                                            </tr>
                                            <tr>
                                                <td>Gearbox Oil Level</td>
                                                <td><input type="checkbox" name="gearbox_oil_level"></td>
                                            </tr>
                                            <tr>
                                                <td>Diff Oil Level</td>
                                                <td><input type="checkbox" name="diff_oil_level"></td>
                                            </tr>
                                            <tr>
                                                <td>Radiator Water Level</td>
                                                <td><input type="checkbox" name="radiator_water_level"></td>
                                            </tr>
                                            <tr>
                                                <td>Power Steering</td>
                                                <td><input type="checkbox" name="power_steering"></td>
                                            </tr>
                                            <tr>
                                                <td>Brake Fluid</td>
                                                <td><input type="checkbox" name="brake_fluid"></td>
                                            </tr>
                                            
                                            <tr>
                                                <td>Clutch FLuid</td>
                                                <td><input type="checkbox" name="clutch_fluid"></td>
                                            </tr>
                                            <tr>
                                                <td>Fan Belt Tension</td>
                                                <td><input type="checkbox" name="fan_belt_tension"></td>
                                            </tr>
                                            <tr>
                                                <td>Battery Electrolyte Water</td>
                                                <td><input type="checkbox" name="battery_electrolyte_water"></td>
                                            </tr>
                                            <tr>
                                                <td>All Lights Checked</td>
                                                <td><input type="checkbox" name="all_lights_checked"></td>
                                            </tr>
                                         
                                            
                                            
                                            
                                            
                                             <tr>
                                                <td>Battery Terminal Tight Checked</td>
                                                <td><input type="checkbox" name="battery_terminal_tight_greased"></td>
                                            </tr>
                                            
                                             <tr>
                                                <td>Windscreen Wiper Water</td>
                                                <td><input type="checkbox" name="windscreen_wiper_water"></td>
                                            </tr>
                                            
                                             <tr>
                                                <td>Engine Oil Level</td>
                                                <td><input type="checkbox" name="engine_oil_level"></td>
                                            </tr>
                                        </tbody>
                                    </table>
                                    <button type="submit" class="btn btn-success">Submit</button>
                                    </form>
                                </div>
                                
                            </div>
                        </div>
                    </div>
                
                </div>
            </div>
                      <%@ include file="../mechanic/layouts/footer.html" %>
 
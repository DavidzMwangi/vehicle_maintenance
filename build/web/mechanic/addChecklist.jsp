
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
                                    <form method="post" action="addChecklist">
                                    
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
                                                <td>Jack</td>
                                                <td><input type="checkbox" name="jack"></td>
                                            </tr>
                                            <tr>
                                                <td>Jack Handle</td>
                                                <td><input type="checkbox" name="jack_handle"></td>
                                            </tr>
                                            <tr>
                                                <td>Spare Wheel</td>
                                                <td><input type="checkbox" name="spare_wheel"></td>
                                            </tr>
                                            <tr>
                                                <td>Radio</td>
                                                <td><input type="checkbox" name="radio"></td>
                                            </tr>
                                            <tr>
                                                <td>Radio Cassette</td>
                                                <td><input type="checkbox" name="radio_cassette"></td>
                                            </tr>
                                            <tr>
                                                <td>Radio Antenna</td>
                                                <td><input type="checkbox" name="radio_antenna"></td>
                                            </tr>
                                            <tr>
                                                <td>Radio Speaker</td>
                                                <td><input type="checkbox" name="radio_speaker"></td>
                                            </tr>
                                            <tr>
                                                <td>Wheel Caps</td>
                                                <td><input type="checkbox" name="wheel_caps"></td>
                                            </tr>
                                            <tr>
                                                <td>Mirrors</td>
                                                <td><input type="checkbox" name="mirrors"></td>
                                            </tr>
                                            <tr>
                                                <td>Wheel Spanner</td>
                                                <td><input type="checkbox" name="wheel_spanner"></td>
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
 
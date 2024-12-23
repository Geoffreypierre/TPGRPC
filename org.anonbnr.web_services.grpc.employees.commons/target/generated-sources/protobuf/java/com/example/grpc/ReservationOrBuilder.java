// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: employee.proto

package com.example.grpc;

public interface ReservationOrBuilder extends
    // @@protoc_insertion_point(interface_extends:com.example.grpc.Reservation)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <code>int64 id = 1;</code>
   * @return The id.
   */
  long getId();

  /**
   * <pre>
   * Date d'arrivée sous format String (par exemple "2024-12-09")
   * </pre>
   *
   * <code>string dateArrivee = 2;</code>
   * @return The dateArrivee.
   */
  java.lang.String getDateArrivee();
  /**
   * <pre>
   * Date d'arrivée sous format String (par exemple "2024-12-09")
   * </pre>
   *
   * <code>string dateArrivee = 2;</code>
   * @return The bytes for dateArrivee.
   */
  com.google.protobuf.ByteString
      getDateArriveeBytes();

  /**
   * <pre>
   * Date de départ sous format String (par exemple "2024-12-10")
   * </pre>
   *
   * <code>string dateDepart = 3;</code>
   * @return The dateDepart.
   */
  java.lang.String getDateDepart();
  /**
   * <pre>
   * Date de départ sous format String (par exemple "2024-12-10")
   * </pre>
   *
   * <code>string dateDepart = 3;</code>
   * @return The bytes for dateDepart.
   */
  com.google.protobuf.ByteString
      getDateDepartBytes();

  /**
   * <pre>
   * Le client associé à la reservation
   * </pre>
   *
   * <code>.com.example.grpc.Client client = 4;</code>
   * @return Whether the client field is set.
   */
  boolean hasClient();
  /**
   * <pre>
   * Le client associé à la reservation
   * </pre>
   *
   * <code>.com.example.grpc.Client client = 4;</code>
   * @return The client.
   */
  com.example.grpc.Client getClient();
  /**
   * <pre>
   * Le client associé à la reservation
   * </pre>
   *
   * <code>.com.example.grpc.Client client = 4;</code>
   */
  com.example.grpc.ClientOrBuilder getClientOrBuilder();

  /**
   * <pre>
   * La chambre réservée
   * </pre>
   *
   * <code>.com.example.grpc.Chambre chambre = 5;</code>
   * @return Whether the chambre field is set.
   */
  boolean hasChambre();
  /**
   * <pre>
   * La chambre réservée
   * </pre>
   *
   * <code>.com.example.grpc.Chambre chambre = 5;</code>
   * @return The chambre.
   */
  com.example.grpc.Chambre getChambre();
  /**
   * <pre>
   * La chambre réservée
   * </pre>
   *
   * <code>.com.example.grpc.Chambre chambre = 5;</code>
   */
  com.example.grpc.ChambreOrBuilder getChambreOrBuilder();
}

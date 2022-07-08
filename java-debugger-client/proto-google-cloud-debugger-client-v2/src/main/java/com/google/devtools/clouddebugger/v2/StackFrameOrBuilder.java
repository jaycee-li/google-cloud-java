/*
 * Copyright 2020 Google LLC
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *     https://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: google/devtools/clouddebugger/v2/data.proto

package com.google.devtools.clouddebugger.v2;

public interface StackFrameOrBuilder
    extends
    // @@protoc_insertion_point(interface_extends:google.devtools.clouddebugger.v2.StackFrame)
    com.google.protobuf.MessageOrBuilder {

  /**
   *
   *
   * <pre>
   * Demangled function name at the call site.
   * </pre>
   *
   * <code>string function = 1;</code>
   *
   * @return The function.
   */
  java.lang.String getFunction();
  /**
   *
   *
   * <pre>
   * Demangled function name at the call site.
   * </pre>
   *
   * <code>string function = 1;</code>
   *
   * @return The bytes for function.
   */
  com.google.protobuf.ByteString getFunctionBytes();

  /**
   *
   *
   * <pre>
   * Source location of the call site.
   * </pre>
   *
   * <code>.google.devtools.clouddebugger.v2.SourceLocation location = 2;</code>
   *
   * @return Whether the location field is set.
   */
  boolean hasLocation();
  /**
   *
   *
   * <pre>
   * Source location of the call site.
   * </pre>
   *
   * <code>.google.devtools.clouddebugger.v2.SourceLocation location = 2;</code>
   *
   * @return The location.
   */
  com.google.devtools.clouddebugger.v2.SourceLocation getLocation();
  /**
   *
   *
   * <pre>
   * Source location of the call site.
   * </pre>
   *
   * <code>.google.devtools.clouddebugger.v2.SourceLocation location = 2;</code>
   */
  com.google.devtools.clouddebugger.v2.SourceLocationOrBuilder getLocationOrBuilder();

  /**
   *
   *
   * <pre>
   * Set of arguments passed to this function.
   * Note that this might not be populated for all stack frames.
   * </pre>
   *
   * <code>repeated .google.devtools.clouddebugger.v2.Variable arguments = 3;</code>
   */
  java.util.List<com.google.devtools.clouddebugger.v2.Variable> getArgumentsList();
  /**
   *
   *
   * <pre>
   * Set of arguments passed to this function.
   * Note that this might not be populated for all stack frames.
   * </pre>
   *
   * <code>repeated .google.devtools.clouddebugger.v2.Variable arguments = 3;</code>
   */
  com.google.devtools.clouddebugger.v2.Variable getArguments(int index);
  /**
   *
   *
   * <pre>
   * Set of arguments passed to this function.
   * Note that this might not be populated for all stack frames.
   * </pre>
   *
   * <code>repeated .google.devtools.clouddebugger.v2.Variable arguments = 3;</code>
   */
  int getArgumentsCount();
  /**
   *
   *
   * <pre>
   * Set of arguments passed to this function.
   * Note that this might not be populated for all stack frames.
   * </pre>
   *
   * <code>repeated .google.devtools.clouddebugger.v2.Variable arguments = 3;</code>
   */
  java.util.List<? extends com.google.devtools.clouddebugger.v2.VariableOrBuilder>
      getArgumentsOrBuilderList();
  /**
   *
   *
   * <pre>
   * Set of arguments passed to this function.
   * Note that this might not be populated for all stack frames.
   * </pre>
   *
   * <code>repeated .google.devtools.clouddebugger.v2.Variable arguments = 3;</code>
   */
  com.google.devtools.clouddebugger.v2.VariableOrBuilder getArgumentsOrBuilder(int index);

  /**
   *
   *
   * <pre>
   * Set of local variables at the stack frame location.
   * Note that this might not be populated for all stack frames.
   * </pre>
   *
   * <code>repeated .google.devtools.clouddebugger.v2.Variable locals = 4;</code>
   */
  java.util.List<com.google.devtools.clouddebugger.v2.Variable> getLocalsList();
  /**
   *
   *
   * <pre>
   * Set of local variables at the stack frame location.
   * Note that this might not be populated for all stack frames.
   * </pre>
   *
   * <code>repeated .google.devtools.clouddebugger.v2.Variable locals = 4;</code>
   */
  com.google.devtools.clouddebugger.v2.Variable getLocals(int index);
  /**
   *
   *
   * <pre>
   * Set of local variables at the stack frame location.
   * Note that this might not be populated for all stack frames.
   * </pre>
   *
   * <code>repeated .google.devtools.clouddebugger.v2.Variable locals = 4;</code>
   */
  int getLocalsCount();
  /**
   *
   *
   * <pre>
   * Set of local variables at the stack frame location.
   * Note that this might not be populated for all stack frames.
   * </pre>
   *
   * <code>repeated .google.devtools.clouddebugger.v2.Variable locals = 4;</code>
   */
  java.util.List<? extends com.google.devtools.clouddebugger.v2.VariableOrBuilder>
      getLocalsOrBuilderList();
  /**
   *
   *
   * <pre>
   * Set of local variables at the stack frame location.
   * Note that this might not be populated for all stack frames.
   * </pre>
   *
   * <code>repeated .google.devtools.clouddebugger.v2.Variable locals = 4;</code>
   */
  com.google.devtools.clouddebugger.v2.VariableOrBuilder getLocalsOrBuilder(int index);
}
/*
 * Copyright (C) 2012 The CyanogenMod Project
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package com.cyanogenmod.filemanager.commands;

/**
 * An interface that represents an executable for compress file system objects.
 */
public interface CompressExecutable extends AsyncResultExecutable {

    /**
     * Method that returns the result of the operation
     *
     * @return Boolean The result of the operation
     */
    Boolean getResult();

    /**
     * Method that returns the path out compressed file
     *
     * @return String The path of the compressed file
     */
    String getOutCompressedFile();
}
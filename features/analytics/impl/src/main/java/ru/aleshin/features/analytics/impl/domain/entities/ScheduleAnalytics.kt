/*
 * Copyright 2023 Stanislav Aleshin
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 * http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package ru.aleshin.features.analytics.impl.domain.entities

import ru.aleshin.core.utils.functional.TimeRange
import ru.aleshin.features.home.api.domain.entities.schedules.TimeTask

/**
 * @author Stanislav Aleshin on 30.04.2023.
 */
internal data class ScheduleAnalytics(
    val dateWorkLoadMap: WorkLoadMap,
    val categoriesAnalytics: CategoriesAnalytics,
    val planningAnalytics: Map<Int, List<PlanningAnalytic>>,
    val totalTasksCount: Int,
    val totalTasksTime: Long,
    val averageDayLoad: Int,
    val averageTaskTime: Long,
)

internal typealias WorkLoadMap = Map<TimeRange, List<TimeTask>>
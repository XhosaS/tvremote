package defpackage;

import com.google.android.gms.dynamite.descriptors.com.google.android.gms.measurement.dynamite.ModuleDescriptor;

/* compiled from: PG */
/* loaded from: classes2.dex */
public enum rpu implements abxf {
    UNKNOWN_EVENT(0),
    META_START_EVENT(1),
    META_END_EVENT(2),
    LIBAS_VOICE_INTERACTION_FROM_HOTWORD(101),
    LIBAS_VOICE_INTERACTION_FROM_TAP(102),
    LIBAS_VOICE_INTERACTION_FROM_CONTINUED_CONVERSATION(103),
    LIBAS_VOICE_INTERACTION_FROM_ALWAYS_ON(104),
    LIBAS_VOICE_INTERACTION_FROM_HOT_GAZE(105),
    LIBAS_VOICE_INTERACTION_FROM_HOT_GESTURE(106),
    LIBAS_VOICE_INTERACTION_FROM_MAGIC_MIC(107),
    LIBAS_VOICE_INTERACTION_FROM_STORYBOOKS(108),
    LIBAS_VOICE_INTERACTION_FROM_HOT_QUERIES(109),
    LIBAS_HOTWORD_PEAK_EVENT(209),
    LIBAS_S3_CONNECTION_UP(110),
    LIBAS_S3_CONNECTION_RETRY(111),
    LIBAS_SPEECH_START_ENDPOINTER_INFERRED(112),
    LIBAS_SPEECH_FINISH_ENDPOINTER_INFERRED(113),
    LIBAS_S3_INTERMEDIATE_RECOGNITION(114),
    LIBAS_S3_FINAL_RECOGNITION(115),
    LIBAS_ASSISTANT_OUTPUT_RECEIVED(116),
    LIBAS_S3_TTS_RECEIVE_START(117),
    LIBAS_S3_TTS_RECEIVE_END(118),
    LIBAS_TTS_PLAYBACK_STARTED(119),
    LIBAS_TTS_PLAYBACK_FINISHED(120),
    LIBAS_CLIENT_OPS_RECEIVED(173),
    LIBAS_CLIENT_OPS_EXECUTED(121),
    LIBAS_INTERACTION_FINISHED_SUCCESS(122),
    LIBAS_INTERACTION_TIMEOUT(123),
    LIBAS_INTERACTION_CANCELLED(124),
    LIBAS_INTERACTION_CANCELLED_BY_BARGE_IN(125),
    LIBAS_INTERACTION_NO_TTS_RESPONSE(126),
    LIBAS_INTERACTION_NO_SPEECH_DETECTED(164),
    LIBAS_INTERACTION_INVALID_REQUEST(172),
    LIBAS_START_OF_SPEECH_ESTIMATION(179),
    LIBAS_S3_START_OF_SPEECH_RECEIVED(180),
    LIBAS_S3_END_OF_SPEECH_RECEIVED(181),
    ASSISTANT_MEDIA_SESSION_START(174),
    ASSISTANT_MEDIA_SESSION_PAUSE(175),
    ASSISTANT_MEDIA_SESSION_RESUME(176),
    ASSISTANT_MEDIA_SESSION_STOP(177),
    ASSISTANT_MEDIA_SESSION_MAX_DURATION_REACHED(178),
    LIBAS_INTERACTION_ERROR_COMMUNICATION(127),
    LIBAS_INTERACTION_CANCELLED_BY_ARBITRATION(128),
    LIBAS_VOICELESS_INTERACTION_FROM_UI_PRESS(129),
    LIBAS_NETWORK_ROUNDTRIP_TIME(138),
    LIBAS_S3_INITIAL_REQUEST_BUILT(139),
    LIBAS_S3_INITIAL_REQUEST_SENT(152),
    LIBAS_S3_ENDPOINTER_RECEIVED(140),
    LIBAS_S3_TRANSPORT_CREATED(153),
    LIBAS_S3_TRANSPORT_STARTED(154),
    LIBAS_REMOTE_CLIENT_OPS_EXECUTED(155),
    LIBAS_S3_TRUE_END_OF_QUERY_ESTIMATION(156),
    LIBAS_REMOTE_CLIENT_OPS_DISPATCHED(158),
    LIBAS_REMOTE_CLIENT_OPS_RECEIVED(159),
    LIBAS_ALARM_TIMER_REQUEST_RECEIVED(160),
    LIBAS_ALARM_TIMER_REQUEST_HANDLED(161),
    LIBAS_CANCEL_ALARM_TIMER_ACTIVITY(163),
    LIBAS_INTERACTION_REJECTED_BY_BLUE_STEEL_ON_DEVICE_MODELS(162),
    CAST_LOCAL_MEDIA_LAUNCH_SUCCESS(130),
    CAST_LOCAL_MEDIA_LAUNCH_FAILED(131),
    CAST_LOCAL_MEDIA_PAUSE_SUCCESS(132),
    CAST_LOCAL_MEDIA_PAUSE_FAILED(133),
    CAST_LOCAL_MEDIA_RESUME_SUCCESS(134),
    CAST_LOCAL_MEDIA_RESUME_FAILED(135),
    CAST_LOCAL_MEDIA_STOP_SUCCESS(136),
    CAST_LOCAL_MEDIA_STOP_FAILED(137),
    CAST_LOCAL_MEDIA_ACTION_SCRIPT_SUCCESS(141),
    CAST_LOCAL_MEDIA_ACTION_SCRIPT_FAILED(142),
    CAST_LOCAL_MEDIA_ACTION_SCRIPT_QUEUED(143),
    CAST_LOCAL_MEDIA_ACTION_SCRIPT_IN_PROGRESS(144),
    LIBAS_START_OF_HOTWORD_AUDIO(165),
    LIBAS_HOTWORD_DETECTION_RECEIVED(166),
    LIBAS_HOTWORD_DETECTED(167),
    LIBAS_MIC_OPENED(168),
    LIBAS_PLAYED_INVOCATION_BEEP(169),
    LIBAS_BEGIN_ACTIVE_INVOCATION(170),
    LIBAS_START_HOTWORD_LISTENING_ON_DISPLAY(171),
    LIBAS_V2_ALARM_TIMER_HANDLER_REGISTRATION_START(145),
    LIBAS_V2_ALARM_TIMER_HANDLER_REGISTRATION_SUCCESS(146),
    LIBAS_V2_ALARM_TIMER_HANDLER_REGISTRATION_FAILED_INVALID_ARG(147),
    LIBAS_V2_ALARM_TIMER_HANDLER_REGISTRATION_FAILED_ALREADY_EXIST(148),
    LIBAS_V2_ALARM_TIMER_HANDLER_REGISTRATION_FAILED_TIMEOUT(149),
    LIBAS_V2_ALARM_TIMER_HANDLER_REGISTRATION_FAILED_UNKNOWN(150),
    LIBAS_ON_DEVICE_ASR_ENDPOINTER_RECEIVED(ModuleDescriptor.MODULE_VERSION),
    LIBAS_ON_DEVICE_ASR_PARTIAL_RECEIVED(157),
    CAST_PLATFORM_TTS_PLAYING(201),
    CAST_PLATFORM_TTS_PAUSED(202),
    CAST_PLATFORM_TTS_IDLE(203),
    CAST_PLATFORM_MEDIA_PLAYING(204),
    CAST_PLATFORM_MEDIA_PAUSED(205),
    CAST_PLATFORM_MEDIA_IDLE(206),
    CAST_PLATFORM_SENTINEL_END_EVENT(207),
    CAST_PLATFORM_TAP_EVENT(208),
    ON_DEVICE_TTS_SYNTHESIZE_START(300),
    ON_DEVICE_FIRST_TTS_BUFFER_RECEIVED(301),
    ON_DEVICE_FINAL_TTS_BUFFER_RECEIVED(302),
    ON_DEVICE_TRUE_END_OF_QUERY_ESTIMATION(303),
    ON_DEVICE_ASSISTANT_SESSION_START(304),
    ON_DEVICE_ASSISTANT_SESSION_END(305),
    ON_DEVICE_ASSISTANT_FINAL_REQUEST_RECEIVED(306),
    ON_DEVICE_ASSISTANT_NLU_CACHE_START(307),
    ON_DEVICE_ASSISTANT_NLU_CACHE_HIT(308),
    ON_DEVICE_ASSISTANT_NLU_CACHE_MISSED(309),
    ON_DEVICE_ASSISTANT_NLU_FULFILLMENT_START(310),
    ON_DEVICE_ASSISTANT_NLU_FULFILLMENT_SUCCESS(311),
    ON_DEVICE_ASSISTANT_NLU_FULFILLMENT_FAILURE(312),
    ON_DEVICE_ASSISTANT_EXECUTION_START(313),
    ON_DEVICE_ASSISTANT_EXECUTION_SUCCESS(314),
    ON_DEVICE_ASSISTANT_EXECUTION_FAILURE(315),
    ON_DEVICE_ASSISTANT_NLU_INTENT_GENERATOR_START(316),
    ON_DEVICE_ASSISTANT_NLU_INTENT_GENERATOR_SUCCESS(317),
    ON_DEVICE_ASSISTANT_NLU_INTENT_GENERATOR_FAILURE(318),
    ON_DEVICE_ASSISTANT_PREFETCH_REQUEST_RECEIVED(319),
    ON_DEVICE_ASSISTANT_GHP_REQUEST_SENT(320),
    ON_DEVICE_ASSISTANT_GHP_RESPONSE_RECEIVED(321),
    ON_DEVICE_ASSISTANT_DEVICE_ARBITRATION_START(322),
    ON_DEVICE_ASSISTANT_DEVICE_ARBITRATION_SUCCESS(323),
    ON_DEVICE_ASSISTANT_DEVICE_ARBITRATION_FAILURE(324),
    ON_DEVICE_ASSISTANT_FINISH_NOTIFICATION_START(325),
    ON_DEVICE_ASSISTANT_FINISH_NOTIFICATION_END(326),
    ON_DEVICE_ASSISTANT_ARBITRATION_RESPONSE_HANDLE_START(327),
    ON_DEVICE_ASSISTANT_ARBITRATION_RESPONSE_HANDLE_END(328),
    ON_DEVICE_ASSISTANT_NLU_CACHE_GET_QUERY_FROM_REQUEST_FAILURE(329),
    ON_DEVICE_ASSISTANT_NLU_CACHE_REPEAT_QUERY_FAILURE(330),
    ON_DEVICE_ASSISTANT_NLU_CACHE_QUERY_MATCH_FAILURE(331),
    ON_DEVICE_ASSISTANT_NLU_CACHE_DEVICE_ID_MATCH_FAILURE(332),
    ON_DEVICE_ASSISTANT_NLU_CACHE_ENTRY_INSERTION_TIME_FAILURE(333),
    ON_DEVICE_ASSISTANT_NLU_CACHE_CLIENT_ATTRIBUTE_UNSUPPORTED(334),
    ON_DEVICE_ASSISTANT_NLU_CACHE_MISSING_SMART_HOME_COMMAND_FAILURE(335),
    ON_DEVICE_ASSISTANT_NLU_CACHE_COMPONENT_ID_FIND_FAILURE(336),
    ON_DEVICE_ASSISTANT_NLU_CACHE_EMPTY_USER_CACHE_MAP_FAILURE(337),
    ON_DEVICE_ASSISTANT_NLU_CACHE_DEVICE_ID_EXTRACTION_FAILURE(338),
    ON_DEVICE_ASSISTANT_CLOUD_QUERY_INTENTIONALLY_IGNORED(339),
    ON_DEVICE_ASSISTANT_PIPELINE_TIMEOUT(340),
    LIBSMARTHOME_INITIATED_WITH_SEMEX_REQUEST(401),
    LIBSMARTHOME_SEMEX_STARTED(402),
    LIBSMARTHOME_FETCH_HOME_GRAPH_STARTED(403),
    LIBSMARTHOME_FETCH_HOME_GRAPH_FINISHED(404),
    LIBSMARTHOME_LHSDK_EXECUTION_STARTED(405),
    LIBSMARTHOME_LHSDK_EXECUTION_FINISHED(406),
    LIBSMARTHOME_GENX_REALIZATION_REQUEST_SENT(407),
    LIBSMARTHOME_GENX_REALIZATION_RESPONSE_RECEIVED(408),
    LIBSMARTHOME_SEMEX_FINISHED(409),
    LIBSMARTHOME_SEMEX_RESPONSE_EMITTED(410),
    LIBSMARTHOME_CONTROL_UI_TITLE_REALIZATION_REQUEST_SENT(411),
    LIBSMARTHOME_CONTROL_UI_TITLE_REALIZATION_RESPONSE_RECEIVED(412),
    EXPLICIT_AUTOMATION_STARTED(413),
    EXPLICIT_AUTOMATION_LIBSMARTHOME_SUCCESS(414),
    EXPLICIT_AUTOMATION_LIBSMARTHOME_FAILED_SERVER_FALLBACK_START(415),
    EXPLICIT_AUTOMATION_LOCAL_V1_SUCCESS(416),
    EXPLICIT_AUTOMATION_SERVER_FINISHED(417),
    EXPLICIT_AUTOMATION_STARTED_FROM_TAP(418),
    LIBSMARTHOME_FETCH_AGENT_INFO_STARTED(419),
    LIBSMARTHOME_FETCH_AGENT_INFO_FINISHED(420),
    OPAL_TAP_INTERACTION(501),
    OPAL_UI_IMPRESSION(502),
    OPAL_ACTIVITY_FOCUSED(503),
    OPAL_RECEIVED_CLIENT_OP(504),
    OPAL_HANDLED_CLIENT_OP(505),
    OPAL_ASSISTANT_REQUEST_SENT(506),
    OPAL_ASSISTANT_REQUEST_START(507),
    OPAL_CAST_APP_SHOWN(508),
    OPAL_WEBVIEW_BEGIN_LOADING(509),
    OPAL_WEBVIEW_FINISH_LOADING(510),
    OPAL_WEBVIEW_IFRAME_BEGIN_LOADING(511),
    OPAL_WEBVIEW_IFRAME_FINISH_LOADING(512),
    OPAL_WEBVIEW_NEW_PAGE_SUCCESS(513),
    OPAL_WEBVIEW_NEW_PAGE_CANCELLED(514),
    OPAL_WEBVIEW_CLOSED(515),
    OPAL_WEBVIEW_TAPPED(516),
    OPAL_HOME_AUTOMATION_ELEMENT_TAPPED(517),
    OPAL_ACTIVITY_START_FOCUS(518),
    OPAL_CAST_WINDOW_OPEN_REQUEST(519),
    OPAL_ALARM_TIMER_REQUEST_SENT(520),
    OPAL_ALARM_TIMER_EVENT_RECEIVED(521),
    OPAL_UI_UPDATE_DONE(522),
    OPAL_NO_UI_UPDATE(523),
    OPAL_UI_CLIENT_OP_RECEIVED(524),
    OPAL_UI_NATIVE_VISIBLE(525),
    OPAL_ACTIVITY_VIEW_PUSHED(526),
    OPAL_RECEIVED_HOTWORD_LISTENING_EVENT(527),
    OPAL_VOICE_PLATE_VISIBLE(528),
    OPAL_HAND_OVER_TO_COMMS(529),
    OPAL_UPDATED_WITH_NO_UI_CHANGES(530),
    CONCURRENCY_DIALOG_REQUESTED(651),
    CONCURRENCY_DIALOG_REQUEST_APPROVED(652),
    CONCURRENCY_DIALOG_REQUEST_DENIED(653),
    CONCURRENCY_DIALOG_REQUEST_CLOSED(654),
    CONCURRENCY_ALERT_ACTIVITY_REQUESTED(655),
    CONCURRENCY_ACTIVITY_MOVE_FOREGROUND(656),
    CONCURRENCY_ACTIVITY_MOVE_BACKGROUND(657),
    CONCURRENCY_ACTIVITY_STOPPED(658),
    CONCURRENCY_ACTIVITY_REQUEST_CLOSED(659),
    CONCURRENCY_GOVERNOR_STOPPED(660),
    CONCURRENCY_GOVERNOR_RELAUNCHED(661),
    CONCURRENCY_MEDIA_ALERT_ACTIVITY_REQUESTED(662),
    CONCURRENCY_DIALOG_REGISTERED(663),
    CONCURRENCY_ACTIVITY_REGISTERED(664),
    CONCURRENCY_NOTIFICATION_ACTIVITY_REQUESTED(665),
    CONCURRENCY_DIALOG_LISTENING(666),
    CONCURRENCY_DIALOG_THINKING(667),
    CONCURRENCY_DIALOG_SPEAKING(668),
    WARM_WORDS_INTERACTION_START(601),
    WARM_WORDS_MATCHER_REQUEST_PREFETCH(602),
    WARM_WORDS_REJECTED_PREFETCH(603),
    WARM_WORDS_TRIGGERED_PREFETCH(604),
    WARM_WORDS_MATCHER_REQUEST(605),
    WARM_WORDS_REJECTED(606),
    WARM_WORDS_TRIGGERED(607),
    LIBAS_STREAMING_INTERACTION_START(700),
    LIBAS_STREAMING_INTERACTION_END(701),
    LIBAS_STREAMING_INTERACTION_ENDPOINTER_RECEIVED(702),
    LIBAS_STREAMING_INTERACTION_INTERMEDIATE_RECOGNITION(703),
    LIBAS_STREAMING_INTERACTION_FINAL_RECOGNITION(704),
    LIBAS_STREAMING_INTERACTION_ASSISTANT_OUTPUT_RECEIVED(705),
    LIBAS_STREAMING_INTERACTION_TTS_RECEIVE_START(706),
    LIBAS_STREAMING_INTERACTION_TTS_RECEIVE_END(707),
    LIBAS_STREAMING_INTERACTION_TTS_PLAYBACK_STARTED(708),
    LIBAS_STREAMING_INTERACTION_TTS_PLAYBACK_FINISHED(709),
    LIBAS_STREAMING_INTERACTION_TTS_PLAYBACK_INTERRUPTED(710),
    LIBAS_STREAMING_INTERACTION_CLIENT_OPS_RECEIVED(711),
    LIBAS_STREAMING_INTERACTION_CLIENT_OPS_EXECUTED(712),
    LIBAS_STREAMING_SESSION_ACTIVITY_START(713),
    LIBAS_STREAMING_SESSION_ACTIVITY_FOREGROUNDED(714),
    LIBAS_STREAMING_SESSION_ACTIVITY_END(715),
    LIBAS_STREAMING_SESSION_MIC_OPENED(716),
    LIBAS_STREAMING_SESSION_MIC_RESET(726),
    LIBAS_STREAMING_SESSION_CONNECTION_UP(717),
    LIBAS_STREAMING_SESSION_CONNECTION_CLOSED(718),
    LIBAS_STREAMING_SESSION_RTT_RECEIVED(719),
    LIBAS_STREAMING_SESSION_GIA_MIC_OPEN_EARCON_PLAYED(720),
    LIBAS_STREAMING_SESSION_GIA_MIC_CLOSED_EARCON_PLAYED(721),
    LIBAS_STREAMING_SESSION_GIA_ENTER_LIVE_MODE_EARCON_PLAYED(722),
    LIBAS_STREAMING_SESSION_GIA_EARCON_PLAYBACK_FAILED(723),
    LIBAS_STREAMING_SESSION_GIA_MIC_CLOSED_EARCON_PLAYBACK_FAILED(727),
    LIBAS_STREAMING_SESSION_GIA_MIC_OPEN_EARCON_PLAYBACK_FAILED(728),
    LIBAS_STREAMING_SESSION_CLIENT_ENDED(724),
    LIBAS_STREAMING_SESSION_SERVER_ENDED(725),
    LIBAS_STREAMING_SESSION_RECONNECTION_ATTEMPT(729),
    LIBAS_STREAMING_SESSION_RECREATE_CLIENT(730),
    LIBAS_STREAMING_SESSION_RECONNECTION_SUCCESS(731),
    LIBAS_STREAMING_SESSION_RECONNECTION_FAILURE(732);

    private final int dJ;

    rpu(int i) {
        this.dJ = i;
    }

    public static rpu b(int i) {
        if (i == 0) {
            return UNKNOWN_EVENT;
        }
        if (i == 1) {
            return META_START_EVENT;
        }
        if (i == 2) {
            return META_END_EVENT;
        }
        switch (i) {
            case 101:
                return LIBAS_VOICE_INTERACTION_FROM_HOTWORD;
            case 102:
                return LIBAS_VOICE_INTERACTION_FROM_TAP;
            case 103:
                return LIBAS_VOICE_INTERACTION_FROM_CONTINUED_CONVERSATION;
            case 104:
                return LIBAS_VOICE_INTERACTION_FROM_ALWAYS_ON;
            case 105:
                return LIBAS_VOICE_INTERACTION_FROM_HOT_GAZE;
            case 106:
                return LIBAS_VOICE_INTERACTION_FROM_HOT_GESTURE;
            case 107:
                return LIBAS_VOICE_INTERACTION_FROM_MAGIC_MIC;
            case 108:
                return LIBAS_VOICE_INTERACTION_FROM_STORYBOOKS;
            case 109:
                return LIBAS_VOICE_INTERACTION_FROM_HOT_QUERIES;
            case 110:
                return LIBAS_S3_CONNECTION_UP;
            case 111:
                return LIBAS_S3_CONNECTION_RETRY;
            case 112:
                return LIBAS_SPEECH_START_ENDPOINTER_INFERRED;
            case 113:
                return LIBAS_SPEECH_FINISH_ENDPOINTER_INFERRED;
            case 114:
                return LIBAS_S3_INTERMEDIATE_RECOGNITION;
            case 115:
                return LIBAS_S3_FINAL_RECOGNITION;
            case 116:
                return LIBAS_ASSISTANT_OUTPUT_RECEIVED;
            case 117:
                return LIBAS_S3_TTS_RECEIVE_START;
            case 118:
                return LIBAS_S3_TTS_RECEIVE_END;
            case 119:
                return LIBAS_TTS_PLAYBACK_STARTED;
            case 120:
                return LIBAS_TTS_PLAYBACK_FINISHED;
            case 121:
                return LIBAS_CLIENT_OPS_EXECUTED;
            case 122:
                return LIBAS_INTERACTION_FINISHED_SUCCESS;
            case 123:
                return LIBAS_INTERACTION_TIMEOUT;
            case 124:
                return LIBAS_INTERACTION_CANCELLED;
            case 125:
                return LIBAS_INTERACTION_CANCELLED_BY_BARGE_IN;
            case 126:
                return LIBAS_INTERACTION_NO_TTS_RESPONSE;
            case 127:
                return LIBAS_INTERACTION_ERROR_COMMUNICATION;
            case 128:
                return LIBAS_INTERACTION_CANCELLED_BY_ARBITRATION;
            case 129:
                return LIBAS_VOICELESS_INTERACTION_FROM_UI_PRESS;
            case 130:
                return CAST_LOCAL_MEDIA_LAUNCH_SUCCESS;
            case 131:
                return CAST_LOCAL_MEDIA_LAUNCH_FAILED;
            case 132:
                return CAST_LOCAL_MEDIA_PAUSE_SUCCESS;
            case 133:
                return CAST_LOCAL_MEDIA_PAUSE_FAILED;
            case 134:
                return CAST_LOCAL_MEDIA_RESUME_SUCCESS;
            case 135:
                return CAST_LOCAL_MEDIA_RESUME_FAILED;
            case 136:
                return CAST_LOCAL_MEDIA_STOP_SUCCESS;
            case 137:
                return CAST_LOCAL_MEDIA_STOP_FAILED;
            case 138:
                return LIBAS_NETWORK_ROUNDTRIP_TIME;
            case 139:
                return LIBAS_S3_INITIAL_REQUEST_BUILT;
            case 140:
                return LIBAS_S3_ENDPOINTER_RECEIVED;
            case 141:
                return CAST_LOCAL_MEDIA_ACTION_SCRIPT_SUCCESS;
            case 142:
                return CAST_LOCAL_MEDIA_ACTION_SCRIPT_FAILED;
            case 143:
                return CAST_LOCAL_MEDIA_ACTION_SCRIPT_QUEUED;
            case 144:
                return CAST_LOCAL_MEDIA_ACTION_SCRIPT_IN_PROGRESS;
            case 145:
                return LIBAS_V2_ALARM_TIMER_HANDLER_REGISTRATION_START;
            case 146:
                return LIBAS_V2_ALARM_TIMER_HANDLER_REGISTRATION_SUCCESS;
            case 147:
                return LIBAS_V2_ALARM_TIMER_HANDLER_REGISTRATION_FAILED_INVALID_ARG;
            case 148:
                return LIBAS_V2_ALARM_TIMER_HANDLER_REGISTRATION_FAILED_ALREADY_EXIST;
            case 149:
                return LIBAS_V2_ALARM_TIMER_HANDLER_REGISTRATION_FAILED_TIMEOUT;
            case 150:
                return LIBAS_V2_ALARM_TIMER_HANDLER_REGISTRATION_FAILED_UNKNOWN;
            case ModuleDescriptor.MODULE_VERSION /* 151 */:
                return LIBAS_ON_DEVICE_ASR_ENDPOINTER_RECEIVED;
            case 152:
                return LIBAS_S3_INITIAL_REQUEST_SENT;
            case 153:
                return LIBAS_S3_TRANSPORT_CREATED;
            case 154:
                return LIBAS_S3_TRANSPORT_STARTED;
            case 155:
                return LIBAS_REMOTE_CLIENT_OPS_EXECUTED;
            case 156:
                return LIBAS_S3_TRUE_END_OF_QUERY_ESTIMATION;
            case 157:
                return LIBAS_ON_DEVICE_ASR_PARTIAL_RECEIVED;
            case 158:
                return LIBAS_REMOTE_CLIENT_OPS_DISPATCHED;
            case 159:
                return LIBAS_REMOTE_CLIENT_OPS_RECEIVED;
            case 160:
                return LIBAS_ALARM_TIMER_REQUEST_RECEIVED;
            case 161:
                return LIBAS_ALARM_TIMER_REQUEST_HANDLED;
            case 162:
                return LIBAS_INTERACTION_REJECTED_BY_BLUE_STEEL_ON_DEVICE_MODELS;
            case 163:
                return LIBAS_CANCEL_ALARM_TIMER_ACTIVITY;
            case 164:
                return LIBAS_INTERACTION_NO_SPEECH_DETECTED;
            case 165:
                return LIBAS_START_OF_HOTWORD_AUDIO;
            case 166:
                return LIBAS_HOTWORD_DETECTION_RECEIVED;
            case 167:
                return LIBAS_HOTWORD_DETECTED;
            case 168:
                return LIBAS_MIC_OPENED;
            case 169:
                return LIBAS_PLAYED_INVOCATION_BEEP;
            case 170:
                return LIBAS_BEGIN_ACTIVE_INVOCATION;
            case 171:
                return LIBAS_START_HOTWORD_LISTENING_ON_DISPLAY;
            case 172:
                return LIBAS_INTERACTION_INVALID_REQUEST;
            case 173:
                return LIBAS_CLIENT_OPS_RECEIVED;
            case 174:
                return ASSISTANT_MEDIA_SESSION_START;
            case 175:
                return ASSISTANT_MEDIA_SESSION_PAUSE;
            case 176:
                return ASSISTANT_MEDIA_SESSION_RESUME;
            case 177:
                return ASSISTANT_MEDIA_SESSION_STOP;
            case 178:
                return ASSISTANT_MEDIA_SESSION_MAX_DURATION_REACHED;
            case 179:
                return LIBAS_START_OF_SPEECH_ESTIMATION;
            case 180:
                return LIBAS_S3_START_OF_SPEECH_RECEIVED;
            case 181:
                return LIBAS_S3_END_OF_SPEECH_RECEIVED;
            default:
                switch (i) {
                    case 201:
                        return CAST_PLATFORM_TTS_PLAYING;
                    case 202:
                        return CAST_PLATFORM_TTS_PAUSED;
                    case 203:
                        return CAST_PLATFORM_TTS_IDLE;
                    case 204:
                        return CAST_PLATFORM_MEDIA_PLAYING;
                    case 205:
                        return CAST_PLATFORM_MEDIA_PAUSED;
                    case 206:
                        return CAST_PLATFORM_MEDIA_IDLE;
                    case 207:
                        return CAST_PLATFORM_SENTINEL_END_EVENT;
                    case 208:
                        return CAST_PLATFORM_TAP_EVENT;
                    case 209:
                        return LIBAS_HOTWORD_PEAK_EVENT;
                    default:
                        switch (i) {
                            case 300:
                                return ON_DEVICE_TTS_SYNTHESIZE_START;
                            case 301:
                                return ON_DEVICE_FIRST_TTS_BUFFER_RECEIVED;
                            case 302:
                                return ON_DEVICE_FINAL_TTS_BUFFER_RECEIVED;
                            case 303:
                                return ON_DEVICE_TRUE_END_OF_QUERY_ESTIMATION;
                            case 304:
                                return ON_DEVICE_ASSISTANT_SESSION_START;
                            case 305:
                                return ON_DEVICE_ASSISTANT_SESSION_END;
                            case 306:
                                return ON_DEVICE_ASSISTANT_FINAL_REQUEST_RECEIVED;
                            case 307:
                                return ON_DEVICE_ASSISTANT_NLU_CACHE_START;
                            case 308:
                                return ON_DEVICE_ASSISTANT_NLU_CACHE_HIT;
                            case 309:
                                return ON_DEVICE_ASSISTANT_NLU_CACHE_MISSED;
                            case 310:
                                return ON_DEVICE_ASSISTANT_NLU_FULFILLMENT_START;
                            case 311:
                                return ON_DEVICE_ASSISTANT_NLU_FULFILLMENT_SUCCESS;
                            case 312:
                                return ON_DEVICE_ASSISTANT_NLU_FULFILLMENT_FAILURE;
                            case 313:
                                return ON_DEVICE_ASSISTANT_EXECUTION_START;
                            case 314:
                                return ON_DEVICE_ASSISTANT_EXECUTION_SUCCESS;
                            case 315:
                                return ON_DEVICE_ASSISTANT_EXECUTION_FAILURE;
                            case 316:
                                return ON_DEVICE_ASSISTANT_NLU_INTENT_GENERATOR_START;
                            case 317:
                                return ON_DEVICE_ASSISTANT_NLU_INTENT_GENERATOR_SUCCESS;
                            case 318:
                                return ON_DEVICE_ASSISTANT_NLU_INTENT_GENERATOR_FAILURE;
                            case 319:
                                return ON_DEVICE_ASSISTANT_PREFETCH_REQUEST_RECEIVED;
                            case 320:
                                return ON_DEVICE_ASSISTANT_GHP_REQUEST_SENT;
                            case 321:
                                return ON_DEVICE_ASSISTANT_GHP_RESPONSE_RECEIVED;
                            case 322:
                                return ON_DEVICE_ASSISTANT_DEVICE_ARBITRATION_START;
                            case 323:
                                return ON_DEVICE_ASSISTANT_DEVICE_ARBITRATION_SUCCESS;
                            case 324:
                                return ON_DEVICE_ASSISTANT_DEVICE_ARBITRATION_FAILURE;
                            case 325:
                                return ON_DEVICE_ASSISTANT_FINISH_NOTIFICATION_START;
                            case 326:
                                return ON_DEVICE_ASSISTANT_FINISH_NOTIFICATION_END;
                            case 327:
                                return ON_DEVICE_ASSISTANT_ARBITRATION_RESPONSE_HANDLE_START;
                            case 328:
                                return ON_DEVICE_ASSISTANT_ARBITRATION_RESPONSE_HANDLE_END;
                            case 329:
                                return ON_DEVICE_ASSISTANT_NLU_CACHE_GET_QUERY_FROM_REQUEST_FAILURE;
                            case 330:
                                return ON_DEVICE_ASSISTANT_NLU_CACHE_REPEAT_QUERY_FAILURE;
                            case 331:
                                return ON_DEVICE_ASSISTANT_NLU_CACHE_QUERY_MATCH_FAILURE;
                            case 332:
                                return ON_DEVICE_ASSISTANT_NLU_CACHE_DEVICE_ID_MATCH_FAILURE;
                            case 333:
                                return ON_DEVICE_ASSISTANT_NLU_CACHE_ENTRY_INSERTION_TIME_FAILURE;
                            case 334:
                                return ON_DEVICE_ASSISTANT_NLU_CACHE_CLIENT_ATTRIBUTE_UNSUPPORTED;
                            case 335:
                                return ON_DEVICE_ASSISTANT_NLU_CACHE_MISSING_SMART_HOME_COMMAND_FAILURE;
                            case 336:
                                return ON_DEVICE_ASSISTANT_NLU_CACHE_COMPONENT_ID_FIND_FAILURE;
                            case 337:
                                return ON_DEVICE_ASSISTANT_NLU_CACHE_EMPTY_USER_CACHE_MAP_FAILURE;
                            case 338:
                                return ON_DEVICE_ASSISTANT_NLU_CACHE_DEVICE_ID_EXTRACTION_FAILURE;
                            case 339:
                                return ON_DEVICE_ASSISTANT_CLOUD_QUERY_INTENTIONALLY_IGNORED;
                            case 340:
                                return ON_DEVICE_ASSISTANT_PIPELINE_TIMEOUT;
                            default:
                                switch (i) {
                                    case 401:
                                        return LIBSMARTHOME_INITIATED_WITH_SEMEX_REQUEST;
                                    case 402:
                                        return LIBSMARTHOME_SEMEX_STARTED;
                                    case 403:
                                        return LIBSMARTHOME_FETCH_HOME_GRAPH_STARTED;
                                    case 404:
                                        return LIBSMARTHOME_FETCH_HOME_GRAPH_FINISHED;
                                    case 405:
                                        return LIBSMARTHOME_LHSDK_EXECUTION_STARTED;
                                    case 406:
                                        return LIBSMARTHOME_LHSDK_EXECUTION_FINISHED;
                                    case 407:
                                        return LIBSMARTHOME_GENX_REALIZATION_REQUEST_SENT;
                                    case 408:
                                        return LIBSMARTHOME_GENX_REALIZATION_RESPONSE_RECEIVED;
                                    case 409:
                                        return LIBSMARTHOME_SEMEX_FINISHED;
                                    case 410:
                                        return LIBSMARTHOME_SEMEX_RESPONSE_EMITTED;
                                    case 411:
                                        return LIBSMARTHOME_CONTROL_UI_TITLE_REALIZATION_REQUEST_SENT;
                                    case 412:
                                        return LIBSMARTHOME_CONTROL_UI_TITLE_REALIZATION_RESPONSE_RECEIVED;
                                    case 413:
                                        return EXPLICIT_AUTOMATION_STARTED;
                                    case 414:
                                        return EXPLICIT_AUTOMATION_LIBSMARTHOME_SUCCESS;
                                    case 415:
                                        return EXPLICIT_AUTOMATION_LIBSMARTHOME_FAILED_SERVER_FALLBACK_START;
                                    case 416:
                                        return EXPLICIT_AUTOMATION_LOCAL_V1_SUCCESS;
                                    case 417:
                                        return EXPLICIT_AUTOMATION_SERVER_FINISHED;
                                    case 418:
                                        return EXPLICIT_AUTOMATION_STARTED_FROM_TAP;
                                    case 419:
                                        return LIBSMARTHOME_FETCH_AGENT_INFO_STARTED;
                                    case 420:
                                        return LIBSMARTHOME_FETCH_AGENT_INFO_FINISHED;
                                    default:
                                        switch (i) {
                                            case 501:
                                                return OPAL_TAP_INTERACTION;
                                            case 502:
                                                return OPAL_UI_IMPRESSION;
                                            case 503:
                                                return OPAL_ACTIVITY_FOCUSED;
                                            case 504:
                                                return OPAL_RECEIVED_CLIENT_OP;
                                            case 505:
                                                return OPAL_HANDLED_CLIENT_OP;
                                            case 506:
                                                return OPAL_ASSISTANT_REQUEST_SENT;
                                            case 507:
                                                return OPAL_ASSISTANT_REQUEST_START;
                                            case 508:
                                                return OPAL_CAST_APP_SHOWN;
                                            case 509:
                                                return OPAL_WEBVIEW_BEGIN_LOADING;
                                            case 510:
                                                return OPAL_WEBVIEW_FINISH_LOADING;
                                            case 511:
                                                return OPAL_WEBVIEW_IFRAME_BEGIN_LOADING;
                                            case 512:
                                                return OPAL_WEBVIEW_IFRAME_FINISH_LOADING;
                                            case 513:
                                                return OPAL_WEBVIEW_NEW_PAGE_SUCCESS;
                                            case 514:
                                                return OPAL_WEBVIEW_NEW_PAGE_CANCELLED;
                                            case 515:
                                                return OPAL_WEBVIEW_CLOSED;
                                            case 516:
                                                return OPAL_WEBVIEW_TAPPED;
                                            case 517:
                                                return OPAL_HOME_AUTOMATION_ELEMENT_TAPPED;
                                            case 518:
                                                return OPAL_ACTIVITY_START_FOCUS;
                                            case 519:
                                                return OPAL_CAST_WINDOW_OPEN_REQUEST;
                                            case 520:
                                                return OPAL_ALARM_TIMER_REQUEST_SENT;
                                            case 521:
                                                return OPAL_ALARM_TIMER_EVENT_RECEIVED;
                                            case 522:
                                                return OPAL_UI_UPDATE_DONE;
                                            case 523:
                                                return OPAL_NO_UI_UPDATE;
                                            case 524:
                                                return OPAL_UI_CLIENT_OP_RECEIVED;
                                            case 525:
                                                return OPAL_UI_NATIVE_VISIBLE;
                                            case 526:
                                                return OPAL_ACTIVITY_VIEW_PUSHED;
                                            case 527:
                                                return OPAL_RECEIVED_HOTWORD_LISTENING_EVENT;
                                            case 528:
                                                return OPAL_VOICE_PLATE_VISIBLE;
                                            case 529:
                                                return OPAL_HAND_OVER_TO_COMMS;
                                            case 530:
                                                return OPAL_UPDATED_WITH_NO_UI_CHANGES;
                                            default:
                                                switch (i) {
                                                    case 601:
                                                        return WARM_WORDS_INTERACTION_START;
                                                    case 602:
                                                        return WARM_WORDS_MATCHER_REQUEST_PREFETCH;
                                                    case 603:
                                                        return WARM_WORDS_REJECTED_PREFETCH;
                                                    case 604:
                                                        return WARM_WORDS_TRIGGERED_PREFETCH;
                                                    case 605:
                                                        return WARM_WORDS_MATCHER_REQUEST;
                                                    case 606:
                                                        return WARM_WORDS_REJECTED;
                                                    case 607:
                                                        return WARM_WORDS_TRIGGERED;
                                                    default:
                                                        switch (i) {
                                                            case 651:
                                                                return CONCURRENCY_DIALOG_REQUESTED;
                                                            case 652:
                                                                return CONCURRENCY_DIALOG_REQUEST_APPROVED;
                                                            case 653:
                                                                return CONCURRENCY_DIALOG_REQUEST_DENIED;
                                                            case 654:
                                                                return CONCURRENCY_DIALOG_REQUEST_CLOSED;
                                                            case 655:
                                                                return CONCURRENCY_ALERT_ACTIVITY_REQUESTED;
                                                            case 656:
                                                                return CONCURRENCY_ACTIVITY_MOVE_FOREGROUND;
                                                            case 657:
                                                                return CONCURRENCY_ACTIVITY_MOVE_BACKGROUND;
                                                            case 658:
                                                                return CONCURRENCY_ACTIVITY_STOPPED;
                                                            case 659:
                                                                return CONCURRENCY_ACTIVITY_REQUEST_CLOSED;
                                                            case 660:
                                                                return CONCURRENCY_GOVERNOR_STOPPED;
                                                            case 661:
                                                                return CONCURRENCY_GOVERNOR_RELAUNCHED;
                                                            case 662:
                                                                return CONCURRENCY_MEDIA_ALERT_ACTIVITY_REQUESTED;
                                                            case 663:
                                                                return CONCURRENCY_DIALOG_REGISTERED;
                                                            case 664:
                                                                return CONCURRENCY_ACTIVITY_REGISTERED;
                                                            case 665:
                                                                return CONCURRENCY_NOTIFICATION_ACTIVITY_REQUESTED;
                                                            case 666:
                                                                return CONCURRENCY_DIALOG_LISTENING;
                                                            case 667:
                                                                return CONCURRENCY_DIALOG_THINKING;
                                                            case 668:
                                                                return CONCURRENCY_DIALOG_SPEAKING;
                                                            default:
                                                                switch (i) {
                                                                    case 700:
                                                                        return LIBAS_STREAMING_INTERACTION_START;
                                                                    case 701:
                                                                        return LIBAS_STREAMING_INTERACTION_END;
                                                                    case 702:
                                                                        return LIBAS_STREAMING_INTERACTION_ENDPOINTER_RECEIVED;
                                                                    case 703:
                                                                        return LIBAS_STREAMING_INTERACTION_INTERMEDIATE_RECOGNITION;
                                                                    case 704:
                                                                        return LIBAS_STREAMING_INTERACTION_FINAL_RECOGNITION;
                                                                    case 705:
                                                                        return LIBAS_STREAMING_INTERACTION_ASSISTANT_OUTPUT_RECEIVED;
                                                                    case 706:
                                                                        return LIBAS_STREAMING_INTERACTION_TTS_RECEIVE_START;
                                                                    case 707:
                                                                        return LIBAS_STREAMING_INTERACTION_TTS_RECEIVE_END;
                                                                    case 708:
                                                                        return LIBAS_STREAMING_INTERACTION_TTS_PLAYBACK_STARTED;
                                                                    case 709:
                                                                        return LIBAS_STREAMING_INTERACTION_TTS_PLAYBACK_FINISHED;
                                                                    case 710:
                                                                        return LIBAS_STREAMING_INTERACTION_TTS_PLAYBACK_INTERRUPTED;
                                                                    case 711:
                                                                        return LIBAS_STREAMING_INTERACTION_CLIENT_OPS_RECEIVED;
                                                                    case 712:
                                                                        return LIBAS_STREAMING_INTERACTION_CLIENT_OPS_EXECUTED;
                                                                    case 713:
                                                                        return LIBAS_STREAMING_SESSION_ACTIVITY_START;
                                                                    case 714:
                                                                        return LIBAS_STREAMING_SESSION_ACTIVITY_FOREGROUNDED;
                                                                    case 715:
                                                                        return LIBAS_STREAMING_SESSION_ACTIVITY_END;
                                                                    case 716:
                                                                        return LIBAS_STREAMING_SESSION_MIC_OPENED;
                                                                    case 717:
                                                                        return LIBAS_STREAMING_SESSION_CONNECTION_UP;
                                                                    case 718:
                                                                        return LIBAS_STREAMING_SESSION_CONNECTION_CLOSED;
                                                                    case 719:
                                                                        return LIBAS_STREAMING_SESSION_RTT_RECEIVED;
                                                                    case 720:
                                                                        return LIBAS_STREAMING_SESSION_GIA_MIC_OPEN_EARCON_PLAYED;
                                                                    case 721:
                                                                        return LIBAS_STREAMING_SESSION_GIA_MIC_CLOSED_EARCON_PLAYED;
                                                                    case 722:
                                                                        return LIBAS_STREAMING_SESSION_GIA_ENTER_LIVE_MODE_EARCON_PLAYED;
                                                                    case 723:
                                                                        return LIBAS_STREAMING_SESSION_GIA_EARCON_PLAYBACK_FAILED;
                                                                    case 724:
                                                                        return LIBAS_STREAMING_SESSION_CLIENT_ENDED;
                                                                    case 725:
                                                                        return LIBAS_STREAMING_SESSION_SERVER_ENDED;
                                                                    case 726:
                                                                        return LIBAS_STREAMING_SESSION_MIC_RESET;
                                                                    case 727:
                                                                        return LIBAS_STREAMING_SESSION_GIA_MIC_CLOSED_EARCON_PLAYBACK_FAILED;
                                                                    case 728:
                                                                        return LIBAS_STREAMING_SESSION_GIA_MIC_OPEN_EARCON_PLAYBACK_FAILED;
                                                                    case 729:
                                                                        return LIBAS_STREAMING_SESSION_RECONNECTION_ATTEMPT;
                                                                    case 730:
                                                                        return LIBAS_STREAMING_SESSION_RECREATE_CLIENT;
                                                                    case 731:
                                                                        return LIBAS_STREAMING_SESSION_RECONNECTION_SUCCESS;
                                                                    case 732:
                                                                        return LIBAS_STREAMING_SESSION_RECONNECTION_FAILURE;
                                                                    default:
                                                                        return null;
                                                                }
                                                        }
                                                }
                                        }
                                }
                        }
                }
        }
    }

    @Override // defpackage.abxf
    public final int a() {
        return this.dJ;
    }

    @Override // java.lang.Enum
    public final String toString() {
        return Integer.toString(this.dJ);
    }
}

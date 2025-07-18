package defpackage;

import org.chromium.net.UrlRequest;

/* compiled from: PG */
/* loaded from: classes2.dex */
public enum acsw implements abxf {
    ERROR_TYPE_UNKNOWN(0),
    ERROR_TYPE_MISSING_IMAGE_SOURCE_DEPRECATED(1),
    ERROR_TYPE_UNSUPPORTED_TEMPLATE_CONFIG_EXTENSION_DEPRECATED(2),
    ERROR_TYPE_TEMPLATE_PROCESSING_ERROR_DEPRECATED(3),
    ERROR_TYPE_COMMAND_ERROR_DEPRECATED(4),
    ERROR_TYPE_TEMPLATE_CONFIG_RESOLVER_ERROR_DEPRECATED(5),
    ERROR_TYPE_UNSPECIFIED_DEPRECATED(6),
    ERROR_TYPE_NULL_COMPONENT_CONTEXT_DEPRECATED(7),
    NULL_COMPONENT_CONTEXT_ERROR_DEPRECATED(8),
    ERROR_TYPE_IMAGE_PRELOAD_DEPRECATED(9),
    ERROR_TYPE_ROOT_ELEMENT_CONVERTER_DEPRECATED(20),
    LOG_LEVEL_INFO_DEPRECATED(10),
    LOG_LEVEL_WARN(11),
    LOG_LEVEL_ERROR_DEPRECATED(12),
    LOG_TYPE_INVALID_FIELD(21),
    LOG_TYPE_MISSING_FIELD(22),
    LOG_TYPE_UNKNOWN_EXTENSION(23),
    LOG_TYPE_MODEL_ERROR(24),
    LOG_TYPE_WIRE_FORMAT_ERROR(25),
    LOG_TYPE_CONFIGURATION_ERROR(26),
    LOG_TYPE_INTERNAL_ERROR(27),
    LOG_TYPE_INTERNAL_TEMPLATE_RESOLUTION_ERROR(28),
    LOG_TYPE_INTERNAL_MISSING_RESOURCE_ERROR(29),
    LOG_TYPE_COMMAND_EXECUTION_ERROR(30),
    LOG_TYPE_INTERNAL_RESOURCE_ERROR(31),
    LOG_TYPE_INTERNAL_UTP_ERROR(32),
    LOG_TYPE_RESOURCE_WARNING(33),
    LOG_TYPE_PROPERTY_RESOLUTION_ERROR(34),
    LOG_TYPE_MISSING_THUMBNAIL(35),
    LOG_TYPE_INTERNAL_DEBUG_WARNING(36);

    public final int E;

    acsw(int i) {
        this.E = i;
    }

    public static acsw b(int i) {
        switch (i) {
            case 0:
                return ERROR_TYPE_UNKNOWN;
            case 1:
                return ERROR_TYPE_MISSING_IMAGE_SOURCE_DEPRECATED;
            case 2:
                return ERROR_TYPE_UNSUPPORTED_TEMPLATE_CONFIG_EXTENSION_DEPRECATED;
            case 3:
                return ERROR_TYPE_TEMPLATE_PROCESSING_ERROR_DEPRECATED;
            case 4:
                return ERROR_TYPE_COMMAND_ERROR_DEPRECATED;
            case 5:
                return ERROR_TYPE_TEMPLATE_CONFIG_RESOLVER_ERROR_DEPRECATED;
            case 6:
                return ERROR_TYPE_UNSPECIFIED_DEPRECATED;
            case 7:
                return ERROR_TYPE_NULL_COMPONENT_CONTEXT_DEPRECATED;
            case 8:
                return NULL_COMPONENT_CONTEXT_ERROR_DEPRECATED;
            case 9:
                return ERROR_TYPE_IMAGE_PRELOAD_DEPRECATED;
            case 10:
                return LOG_LEVEL_INFO_DEPRECATED;
            case 11:
                return LOG_LEVEL_WARN;
            case UrlRequest.Status.SENDING_REQUEST /* 12 */:
                return LOG_LEVEL_ERROR_DEPRECATED;
            default:
                switch (i) {
                    case 20:
                        return ERROR_TYPE_ROOT_ELEMENT_CONVERTER_DEPRECATED;
                    case 21:
                        return LOG_TYPE_INVALID_FIELD;
                    case 22:
                        return LOG_TYPE_MISSING_FIELD;
                    case 23:
                        return LOG_TYPE_UNKNOWN_EXTENSION;
                    case 24:
                        return LOG_TYPE_MODEL_ERROR;
                    case 25:
                        return LOG_TYPE_WIRE_FORMAT_ERROR;
                    case 26:
                        return LOG_TYPE_CONFIGURATION_ERROR;
                    case 27:
                        return LOG_TYPE_INTERNAL_ERROR;
                    case 28:
                        return LOG_TYPE_INTERNAL_TEMPLATE_RESOLUTION_ERROR;
                    case 29:
                        return LOG_TYPE_INTERNAL_MISSING_RESOURCE_ERROR;
                    case 30:
                        return LOG_TYPE_COMMAND_EXECUTION_ERROR;
                    case 31:
                        return LOG_TYPE_INTERNAL_RESOURCE_ERROR;
                    case 32:
                        return LOG_TYPE_INTERNAL_UTP_ERROR;
                    case 33:
                        return LOG_TYPE_RESOURCE_WARNING;
                    case 34:
                        return LOG_TYPE_PROPERTY_RESOLUTION_ERROR;
                    case 35:
                        return LOG_TYPE_MISSING_THUMBNAIL;
                    case 36:
                        return LOG_TYPE_INTERNAL_DEBUG_WARNING;
                    default:
                        return null;
                }
        }
    }

    @Override // defpackage.abxf
    public final int a() {
        return this.E;
    }

    @Override // java.lang.Enum
    public final String toString() {
        return Integer.toString(this.E);
    }
}

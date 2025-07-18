package defpackage;

import org.chromium.net.UrlRequest;

/* compiled from: PG */
/* loaded from: classes2.dex */
public enum rwk implements abxf {
    UNKNOWN_DISCONNECT_REASON(0),
    DISCONNECT_REASON_FAILED_CONNECT_TO_AUDIO_ROUTE(1),
    DISCONNECT_REASON_AUDIO_ROUTE_LOST(2),
    DISCONNECT_REASON_CLIENT_REQUESTED_ROUTE_UPDATE(3),
    DISCONNECT_REASON_MISSING_AUDIO_ROUTE_IMPLEMENTATION(4),
    DISCONNECT_REASON_CLIENT_DEACTIVATED(5),
    DISCONNECT_REASON_AUDIO_ADAPTER_UNREGISTERED(6),
    DISCONNECT_REASON_AUDIO_ADAPTER_NOT_REGISTERED(7),
    DISCONNECT_REASON_INACTIVE_CLIENT(8),
    DISCONNECT_REASON_START_SCO_FAILED(9),
    DISCONNECT_REASON_START_SCO_TIMEOUT(10),
    DISCONNECT_REASON_NO_BLUETOOTH_HEADSET_CONNECTED(11),
    DISCONNECT_REASON_NO_BLUETOOTH_PROFILE_FOUND(12),
    DISCONNECT_REASON_FAILED_GETTING_BLUETOOTH_HEADSET(13),
    DISCONNECT_REASON_BLUETOOTH_NOT_AVAILABLE(14),
    DISCONNECT_REASON_BLUETOOTH_PERMISSION_DENIED(15),
    DISCONNECT_REASON_FAILED_CONNECT_TO_AUDIO_ADAPTER(16),
    DISCONNECT_REASON_UNEXPECTED_AUDIO_ADAPTER_CONNECTION(17),
    DISCONNECT_REASON_BLUETOOTH_HEADSET_DISCONNECTED(18),
    DISCONNECT_REASON_BLUETOOTH_HEADSET_PROFILE_DISCONNECTED(19),
    DISCONNECT_REASON_BLUETOOTH_HEADSET_AUDIO_DISCONNECTED(20),
    DISCONNECT_REASON_START_BLUETOOTH_HEADSET_AUDIO_CONNECTION_FAILED(21),
    DISCONNECT_REASON_BLUETOOTH_HEADSET_AUDIO_CONNECTION_TIMEOUT(22),
    DISCONNECT_REASON_UNSUPPORTED_HOTWORD_ROUTE_PARAMS(24),
    DISCONNECT_REASON_ROUTE_NOT_MAPPED(25),
    DISCONNECT_REASON_CONCURRENCY_CONFLICT(26),
    DISCONNECT_REASON_NEW_CLIENT_ACTIVATING(27),
    DISCONNECT_REASON_BLUETOOTH_DEVICE_DENYLISTED(28),
    DISCONNECT_REASON_AAP_CONNECTED(29),
    DISCONNECT_REASON_INCOMPATIBLE_SDK(30),
    DISCONNECT_REASON_DYNAMIC_SWITCHING_NO_NEXT_SOURCE(31),
    DISCONNECT_REASON_INACTIVE_PARENT(32),
    DISCONNECT_REASON_NO_BLUETOOTH_DEVICE_FOUND(33),
    DISCONNECT_REASON_VOICE_RECOGNITION_FAILED(34),
    DISCONNECT_REASON_SET_COMMUNICATION_DEVICE_FAILED(35),
    DISCONNECT_REASON_START_BLUETOOTH_SCO_FAILED(36),
    FAILED_GETTING_DISCONNECT_REASON(100),
    FAILED_GETTING_GRPC_DISCONNECT_REASON(200),
    DISCONNECT_REASON_REMOTE_COMMUNICATION_CHANNEL_SHUTDOWN(201);

    public final int N;

    rwk(int i) {
        this.N = i;
    }

    public static rwk b(int i) {
        if (i == 100) {
            return FAILED_GETTING_DISCONNECT_REASON;
        }
        if (i == 200) {
            return FAILED_GETTING_GRPC_DISCONNECT_REASON;
        }
        if (i == 201) {
            return DISCONNECT_REASON_REMOTE_COMMUNICATION_CHANNEL_SHUTDOWN;
        }
        switch (i) {
            case 0:
                return UNKNOWN_DISCONNECT_REASON;
            case 1:
                return DISCONNECT_REASON_FAILED_CONNECT_TO_AUDIO_ROUTE;
            case 2:
                return DISCONNECT_REASON_AUDIO_ROUTE_LOST;
            case 3:
                return DISCONNECT_REASON_CLIENT_REQUESTED_ROUTE_UPDATE;
            case 4:
                return DISCONNECT_REASON_MISSING_AUDIO_ROUTE_IMPLEMENTATION;
            case 5:
                return DISCONNECT_REASON_CLIENT_DEACTIVATED;
            case 6:
                return DISCONNECT_REASON_AUDIO_ADAPTER_UNREGISTERED;
            case 7:
                return DISCONNECT_REASON_AUDIO_ADAPTER_NOT_REGISTERED;
            case 8:
                return DISCONNECT_REASON_INACTIVE_CLIENT;
            case 9:
                return DISCONNECT_REASON_START_SCO_FAILED;
            case 10:
                return DISCONNECT_REASON_START_SCO_TIMEOUT;
            case 11:
                return DISCONNECT_REASON_NO_BLUETOOTH_HEADSET_CONNECTED;
            case UrlRequest.Status.SENDING_REQUEST /* 12 */:
                return DISCONNECT_REASON_NO_BLUETOOTH_PROFILE_FOUND;
            case UrlRequest.Status.WAITING_FOR_RESPONSE /* 13 */:
                return DISCONNECT_REASON_FAILED_GETTING_BLUETOOTH_HEADSET;
            case UrlRequest.Status.READING_RESPONSE /* 14 */:
                return DISCONNECT_REASON_BLUETOOTH_NOT_AVAILABLE;
            case 15:
                return DISCONNECT_REASON_BLUETOOTH_PERMISSION_DENIED;
            case 16:
                return DISCONNECT_REASON_FAILED_CONNECT_TO_AUDIO_ADAPTER;
            case 17:
                return DISCONNECT_REASON_UNEXPECTED_AUDIO_ADAPTER_CONNECTION;
            case 18:
                return DISCONNECT_REASON_BLUETOOTH_HEADSET_DISCONNECTED;
            case 19:
                return DISCONNECT_REASON_BLUETOOTH_HEADSET_PROFILE_DISCONNECTED;
            case 20:
                return DISCONNECT_REASON_BLUETOOTH_HEADSET_AUDIO_DISCONNECTED;
            case 21:
                return DISCONNECT_REASON_START_BLUETOOTH_HEADSET_AUDIO_CONNECTION_FAILED;
            case 22:
                return DISCONNECT_REASON_BLUETOOTH_HEADSET_AUDIO_CONNECTION_TIMEOUT;
            default:
                switch (i) {
                    case 24:
                        return DISCONNECT_REASON_UNSUPPORTED_HOTWORD_ROUTE_PARAMS;
                    case 25:
                        return DISCONNECT_REASON_ROUTE_NOT_MAPPED;
                    case 26:
                        return DISCONNECT_REASON_CONCURRENCY_CONFLICT;
                    case 27:
                        return DISCONNECT_REASON_NEW_CLIENT_ACTIVATING;
                    case 28:
                        return DISCONNECT_REASON_BLUETOOTH_DEVICE_DENYLISTED;
                    case 29:
                        return DISCONNECT_REASON_AAP_CONNECTED;
                    case 30:
                        return DISCONNECT_REASON_INCOMPATIBLE_SDK;
                    case 31:
                        return DISCONNECT_REASON_DYNAMIC_SWITCHING_NO_NEXT_SOURCE;
                    case 32:
                        return DISCONNECT_REASON_INACTIVE_PARENT;
                    case 33:
                        return DISCONNECT_REASON_NO_BLUETOOTH_DEVICE_FOUND;
                    case 34:
                        return DISCONNECT_REASON_VOICE_RECOGNITION_FAILED;
                    case 35:
                        return DISCONNECT_REASON_SET_COMMUNICATION_DEVICE_FAILED;
                    case 36:
                        return DISCONNECT_REASON_START_BLUETOOTH_SCO_FAILED;
                    default:
                        return null;
                }
        }
    }

    @Override // defpackage.abxf
    public final int a() {
        return this.N;
    }

    @Override // java.lang.Enum
    public final String toString() {
        return Integer.toString(this.N);
    }
}

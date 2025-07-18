package defpackage;

import org.chromium.net.UrlRequest;

/* compiled from: PG */
/* loaded from: classes2.dex */
public enum ybl implements abxf {
    UNKNOWN_FAILURE_TYPE(0),
    UNEXPECTED_SETUP_ACCOUNT(1),
    HOMEGRAPH_LOAD_FAILURE(2),
    SELECT_ROOM_HOMEGRAPH_REFRESH_FAILURE(3),
    CREATE_ROOM_FAILURE(4),
    CREATE_HOME_FAILURE(5),
    ROOM_UPDATE_FAILURE(6),
    NULL_OPERATION(7),
    INVALID_CAST_INFO(8),
    DEVICE_NOT_IN_HOME_GRAPH(9),
    DEVICE_ALREADY_ASSIGNED_TO_ROOM(10),
    FIRST_SCREEN_LOADING_TIMEOUT(11),
    INVALID_CERTIFICATE_FROM_CONTENT_PROVIDER(12),
    INVALID_CERTIFICATE_FROM_CAST_SERVICE(13),
    INVALID_CERTIFICATE(14),
    KATNISS_ACCOUNT_MANAGER_INITIALIZATION_TIMEOUT(15);

    public final int q;

    ybl(int i) {
        this.q = i;
    }

    public static ybl b(int i) {
        switch (i) {
            case 0:
                return UNKNOWN_FAILURE_TYPE;
            case 1:
                return UNEXPECTED_SETUP_ACCOUNT;
            case 2:
                return HOMEGRAPH_LOAD_FAILURE;
            case 3:
                return SELECT_ROOM_HOMEGRAPH_REFRESH_FAILURE;
            case 4:
                return CREATE_ROOM_FAILURE;
            case 5:
                return CREATE_HOME_FAILURE;
            case 6:
                return ROOM_UPDATE_FAILURE;
            case 7:
                return NULL_OPERATION;
            case 8:
                return INVALID_CAST_INFO;
            case 9:
                return DEVICE_NOT_IN_HOME_GRAPH;
            case 10:
                return DEVICE_ALREADY_ASSIGNED_TO_ROOM;
            case 11:
                return FIRST_SCREEN_LOADING_TIMEOUT;
            case UrlRequest.Status.SENDING_REQUEST /* 12 */:
                return INVALID_CERTIFICATE_FROM_CONTENT_PROVIDER;
            case UrlRequest.Status.WAITING_FOR_RESPONSE /* 13 */:
                return INVALID_CERTIFICATE_FROM_CAST_SERVICE;
            case UrlRequest.Status.READING_RESPONSE /* 14 */:
                return INVALID_CERTIFICATE;
            case 15:
                return KATNISS_ACCOUNT_MANAGER_INITIALIZATION_TIMEOUT;
            default:
                return null;
        }
    }

    @Override // defpackage.abxf
    public final int a() {
        return this.q;
    }

    @Override // java.lang.Enum
    public final String toString() {
        return Integer.toString(this.q);
    }
}

package defpackage;

import org.chromium.net.UrlRequest;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class jrf {
    public final int a(int i) {
        switch (i) {
            case 0:
            case 1:
            case 2:
            case 3:
            case 9:
            case 15:
            case 16:
                return 0;
            case 4:
            case 5:
                return 1;
            case 6:
                return 2;
            case 7:
                return 3;
            case 8:
                return 4;
            case 10:
            case 11:
            case UrlRequest.Status.READING_RESPONSE /* 14 */:
                return 5;
            case UrlRequest.Status.SENDING_REQUEST /* 12 */:
                return 6;
            case UrlRequest.Status.WAITING_FOR_RESPONSE /* 13 */:
                return 7;
            default:
                throw new IllegalArgumentException(a.b(i, "bad logoState "));
        }
    }

    public final jrb b(int i) {
        switch (i) {
            case 0:
            case 5:
                return jrb.o;
            case 1:
            case 8:
                return jrb.b;
            case 2:
                return jrb.p;
            case 3:
                return jrb.s;
            case 4:
                return jrb.c;
            case 6:
                return jrb.A;
            case 7:
                return jrb.u;
            default:
                throw new IllegalArgumentException(a.b(i, "bad state group: "));
        }
    }

    public final jrb c(int i) {
        switch (i) {
            case 0:
            case 8:
                return jrb.b;
            case 1:
                return jrb.n;
            case 2:
                return jrb.r;
            case 3:
            case 7:
                return jrb.t;
            case 4:
                return jrb.e;
            case 5:
                return jrb.x;
            case 6:
                return jrb.C;
            default:
                throw new IllegalArgumentException(a.b(i, "bad state group: "));
        }
    }

    public final jrb d(int i) {
        switch (i) {
            case 0:
                return jrb.b;
            case 1:
                return jrb.f;
            case 2:
                return jrb.g;
            case 3:
                return jrb.i;
            case 4:
                return jrb.l;
            case 5:
                return jrb.m;
            case 6:
                return jrb.q;
            case 7:
            case UrlRequest.Status.WAITING_FOR_RESPONSE /* 13 */:
                return jrb.v;
            case 8:
                return jrb.d;
            case 9:
                return jrb.k;
            case 10:
                return jrb.w;
            case 11:
                return jrb.y;
            case UrlRequest.Status.SENDING_REQUEST /* 12 */:
                return jrb.B;
            case UrlRequest.Status.READING_RESPONSE /* 14 */:
                return jrb.z;
            case 15:
                return jrb.h;
            case 16:
                return jrb.j;
            default:
                throw new IllegalArgumentException(a.b(i, "bad logoState "));
        }
    }
}

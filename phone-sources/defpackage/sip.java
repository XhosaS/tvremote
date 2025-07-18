package defpackage;

import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.Color;
import android.net.NetworkInfo;
import android.util.TypedValue;
import android.view.View;
import com.google.android.videos.R;
import java.io.Closeable;
import java.io.IOException;
import java.math.BigInteger;
import java.security.cert.Certificate;
import javax.net.ssl.SSLPeerUnverifiedException;
import javax.net.ssl.SSLSession;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class sip {
    public static volatile thm a;

    @Deprecated
    public static void a(Closeable closeable) throws IOException {
        if (closeable != null) {
            try {
                closeable.close();
            } catch (IOException unused) {
            }
        }
    }

    public static int b(int i, int i2) {
        return csq.g(i, (Color.alpha(i) * i2) / 255);
    }

    public static int c(View view, int i) {
        return p(view.getContext(), sim.e(view, i));
    }

    public static int d(Context context, int i, int i2) {
        Integer numH = h(context, i);
        return numH != null ? numH.intValue() : i2;
    }

    public static int e(Context context, int i, String str) {
        return p(context, sim.f(context, i, str));
    }

    public static int f(int i, int i2, float f) {
        return csq.f(csq.g(i2, Math.round(Color.alpha(i2) * f)), i);
    }

    public static ColorStateList g(Context context, int i) {
        TypedValue typedValueD = sim.d(context, i);
        if (typedValueD == null) {
            return null;
        }
        if (typedValueD.resourceId != 0) {
            return czi.c(context, typedValueD.resourceId);
        }
        if (typedValueD.data != 0) {
            return ColorStateList.valueOf(typedValueD.data);
        }
        return null;
    }

    public static Integer h(Context context, int i) {
        TypedValue typedValueD = sim.d(context, i);
        if (typedValueD != null) {
            return Integer.valueOf(p(context, typedValueD));
        }
        return null;
    }

    public static boolean i(int i) {
        return i != 0 && csq.b(i) > 0.5d;
    }

    public static boolean j(Context context) {
        return sim.g(context, R.attr.isLightTheme, true);
    }

    public static /* synthetic */ String k(int i) {
        switch (i) {
            case 2:
                return "PAIRING_REQUEST";
            case 3:
                return "PAIRING_REQUEST_ACK";
            case 4:
                return "OPTIONS";
            case 5:
                return "CONFIGURATION";
            case 6:
                return "CONFIGURATION_ACK";
            case 7:
                return "SECRET";
            default:
                return "SECRET_ACK";
        }
    }

    public static /* synthetic */ String l(int i) {
        return i != 1 ? i != 2 ? i != 3 ? "null" : "DISPLAY_DEVICE" : "INPUT_DEVICE" : "UNKNOWN";
    }

    public static String m(byte[] bArr) {
        int length;
        if (bArr == null || (length = bArr.length) == 0) {
            return "";
        }
        return String.format("%0" + (length + length) + "x", new BigInteger(1, bArr));
    }

    public static Certificate n(SSLSession sSLSession) throws tij, SSLPeerUnverifiedException {
        try {
            Certificate[] peerCertificates = sSLSession.getPeerCertificates();
            if (peerCertificates != null && peerCertificates.length > 0) {
                return peerCertificates[0];
            }
            throw new tij("No peer certificate for " + sSLSession.getProtocol() + " " + sSLSession.getCipherSuite());
        } catch (SSLPeerUnverifiedException e) {
            throw new tij(e);
        }
    }

    public static int o(NetworkInfo networkInfo) {
        if (networkInfo == null || !networkInfo.isConnected()) {
            return 8;
        }
        int type = networkInfo.getType();
        if (type == 9) {
            return 6;
        }
        if (type == 16) {
            return networkInfo.getSubtype() != 0 ? 0 : 7;
        }
        switch (type) {
            case 0:
            case 2:
            case 3:
            case 4:
            case 5:
                int subtype = networkInfo.getSubtype();
                if (subtype == 17) {
                    return 2;
                }
                if (subtype == 20) {
                    return 9;
                }
                switch (subtype) {
                    case 1:
                    case 2:
                    case 4:
                    case 7:
                    case 11:
                        return 1;
                    case 3:
                    case 5:
                    case 6:
                    case 8:
                    case 9:
                    case 10:
                    case 12:
                    case 14:
                    case 15:
                        return 2;
                    case 13:
                        return 3;
                    default:
                        return 5;
                }
            case 1:
                return 4;
            case 6:
                return 3;
            case 7:
                return 7;
            default:
                return 0;
        }
    }

    private static int p(Context context, TypedValue typedValue) {
        return typedValue.resourceId != 0 ? context.getColor(typedValue.resourceId) : typedValue.data;
    }
}

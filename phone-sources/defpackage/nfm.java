package defpackage;

import android.content.Context;
import android.media.DeniedByServerException;
import android.media.MediaDrm;
import android.media.NotProvisionedException;
import android.net.Uri;
import java.io.IOException;
import java.net.SocketTimeoutException;
import java.net.UnknownHostException;
import java.util.regex.Pattern;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class nfm extends nez {
    private static final Pattern a = Pattern.compile("[\\.$]");
    private final Context c;
    private IOException d;
    private boolean e;
    private int f;

    public nfm(Context context) {
        this.c = context.getApplicationContext();
    }

    private static String A(String str) {
        if (str.contains("Error")) {
            str = str.replace("Error", "E");
        }
        return str.contains("Exception") ? str.replace("Exception", "E") : str;
    }

    private static Throwable B(Throwable th) {
        Throwable cause = th.getCause();
        return cause == null ? th : cause;
    }

    private static void C(StringBuilder sb, String str) {
        String[] strArrSplit = a.split(str);
        for (int i = 0; i < strArrSplit.length; i++) {
            if (i > 0) {
                sb.append('.');
            }
            sb.append((CharSequence) strArrSplit[i], 0, Math.min(4, strArrSplit[i].length()));
        }
    }

    private static void D(StringBuilder sb, Throwable th) {
        sb.append(A(th.getClass().getSimpleName()));
        StackTraceElement[] stackTrace = th.getStackTrace();
        if (stackTrace.length != 0) {
            int i = 0;
            while (i < Math.min(3, stackTrace.length)) {
                sb.append(i == 0 ? '.' : '/');
                StackTraceElement stackTraceElement = stackTrace[i];
                C(sb, stackTraceElement.getClassName());
                sb.append('.');
                C(sb, stackTraceElement.getMethodName());
                sb.append('.');
                sb.append(stackTraceElement.getLineNumber());
                i++;
            }
        }
    }

    private final void E(ekl eklVar, IOException iOException, int i, boolean z, boolean z2) {
        String strConcat;
        String str;
        String str2;
        String strConcat2;
        int i2;
        int iB = nxo.l(this.c).b();
        strConcat = "net.retryexhausted";
        int i3 = 0;
        if (iOException instanceof efm) {
            efm efmVar = (efm) iOException;
            strConcat = true != z2 ? "net.badstatus" : "net.retryexhausted";
            if (z) {
                strConcat = "manifest.".concat(strConcat);
                z = true;
            } else {
                z = false;
            }
            strConcat2 = strConcat;
            i3 = 1;
            i2 = efmVar.c;
        } else {
            if ((iOException instanceof efl) || (iOException instanceof eaf)) {
                str = true != z ? "fmt.unparseable" : "manifest.unparseable";
            } else {
                boolean z3 = iOException instanceof efk;
                if (z3 || (iOException instanceof efz)) {
                    if (!z2) {
                        if (iB == 1) {
                            strConcat = "net.unavailable";
                        } else {
                            Throwable cause = iOException.getCause();
                            strConcat = cause instanceof UnknownHostException ? "net.dns" : cause instanceof SocketTimeoutException ? "net.timeout" : (z3 && ((efk) iOException).b == 1) ? "net.connect" : "net.closed";
                        }
                    }
                    if (z) {
                        strConcat2 = "manifest.".concat(strConcat);
                        z = true;
                    } else {
                        strConcat2 = strConcat;
                        z = false;
                    }
                    i2 = -1;
                } else if (iOException instanceof euw) {
                    str2 = "qoe.livewindow";
                    strConcat2 = str2;
                    i2 = -1;
                } else {
                    str = true != z2 ? "player.exception" : "player.fatalexception";
                }
            }
            str2 = str;
            strConcat2 = str2;
            i2 = -1;
        }
        F(eklVar, strConcat2, null, i3, i2, i, iOException);
        this.d = iOException;
        this.e = z;
        this.f = i;
    }

    private final void F(ekl eklVar, String str, String str2, int i, int i2, int i3, Throwable th) {
        StringBuilder sbE = this.b.e(eklVar.a);
        sbE.append(str);
        sbE.append(':');
        sbE.append(nfa.b(eklVar.e));
        sbE.append(':');
        if (i != 1) {
            sbE.append("exception.");
            D(sbE, th);
            String message = th.getMessage();
            if (message != null) {
                String strReplaceAll = A(message).replaceAll("[:,;]", "");
                if (strReplaceAll.length() > 100) {
                    strReplaceAll = strReplaceAll.substring(0, 100);
                }
                sbE.append(' ');
                sbE.append(strReplaceAll);
            }
            int i4 = 3;
            for (Throwable cause = th.getCause(); cause != null; cause = cause.getCause()) {
                i4--;
                if (i4 <= 0) {
                    break;
                }
                if (i4 == 2) {
                    sbE.append(";ncause.");
                } else {
                    sbE.append('-');
                }
                D(sbE, cause);
            }
        } else {
            sbE.append("rc.");
            sbE.append(i2);
            i = 1;
        }
        if (str2 != null) {
            sbE.append(";src.");
            sbE.append(str2);
        }
        if (i == 2) {
            sbE.append(";ec.");
            sbE.append(i2);
        }
        if (i3 != -1) {
            sbE.append(";rn.");
            sbE.append(i3);
        }
        this.b.f("error", sbE.toString());
    }

    @Override // defpackage.nez
    public final void b() {
        this.b.g("error");
    }

    @Override // defpackage.nez
    public final void d(ekl eklVar, int i, long j, long j2, boolean z) {
        if (z) {
            F(eklVar, "underrun", null, 0, 0, -1, new Exception("underrun size=" + i + " ms=" + j + " elapsed=" + j2));
        }
    }

    @Override // defpackage.nez
    public final void g(ekl eklVar, Exception exc, boolean z) throws NumberFormatException {
        String str;
        int i;
        int i2;
        if (z) {
            if (exc instanceof MediaDrm.MediaDrmStateException) {
                int iM = edt.m(((MediaDrm.MediaDrmStateException) exc).getDiagnosticInfo());
                str = "drm.keyerror";
                i2 = iM;
                i = iM != 0 ? 2 : 0;
            } else {
                str = exc instanceof NotProvisionedException ? "drm.provision" : exc instanceof DeniedByServerException ? "drm.auth" : "drm";
                i = 0;
                i2 = 0;
            }
            F(eklVar, str, null, i, i2, -1, exc);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:56:0x00c6  */
    /* JADX WARN: Removed duplicated region for block: B:57:0x00c8  */
    /* JADX WARN: Removed duplicated region for block: B:60:0x00cc  */
    @Override // defpackage.nez
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void l(defpackage.ekl r9, defpackage.eah r10, boolean r11) throws java.lang.NumberFormatException {
        /*
            Method dump skipped, instructions count: 217
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.nfm.l(ekl, eah, boolean):void");
    }

    @Override // defpackage.nez
    public final void t(ekl eklVar, evq evqVar, evv evvVar, IOException iOException, boolean z) throws NumberFormatException {
        String queryParameter;
        if (z) {
            boolean z2 = evvVar.a == 4;
            Uri uri = evqVar.a.a;
            int i = -1;
            if (uri.isHierarchical() && (queryParameter = uri.getQueryParameter("rn")) != null) {
                try {
                    i = Integer.parseInt(queryParameter);
                } catch (NumberFormatException unused) {
                }
            }
            E(eklVar, iOException, i, z2, false);
        }
    }
}

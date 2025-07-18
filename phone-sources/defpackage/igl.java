package defpackage;

import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.widget.Toast;
import com.google.android.apps.googletv.app.presentation.pages.webview.WebViewActivity;
import com.google.android.videos.R;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class igl implements ixf {
    public final Object a;
    private final /* synthetic */ int b;

    public igl(irc ircVar, int i) {
        this.b = i;
        ircVar.getClass();
        this.a = ircVar;
    }

    @Override // defpackage.ixf
    public final void a(wkg wkgVar, Context context, String str, String str2) {
        int i = this.b;
        if (i == 0) {
            vvd vvdVar = wqe.c;
            wkgVar.i(vvdVar);
            Object objK = wkgVar.l.k((vub) vvdVar.c);
            if (objK == null) {
                objK = vvdVar.b;
            } else {
                vvdVar.c(objK);
            }
            woi woiVar = ((wqe) objK).b;
            if (woiVar == null) {
                woiVar = woi.a;
            }
            Object obj = this.a;
            woiVar.getClass();
            ((kwy) obj).a(context, woiVar);
            return;
        }
        int i2 = 1;
        if (i == 1) {
            vvd vvdVar2 = wpv.h;
            wkgVar.i(vvdVar2);
            Object objK2 = wkgVar.l.k((vub) vvdVar2.c);
            if (objK2 == null) {
                objK2 = vvdVar2.b;
            } else {
                vvdVar2.c(objK2);
            }
            wpv wpvVar = (wpv) objK2;
            ssn ssnVar = new ssn(context);
            int iAY = a.aY(wpvVar.c);
            if (iAY == 0) {
                iAY = 1;
            }
            Integer numValueOf = iAY + (-1) == 1 ? Integer.valueOf(R.drawable.ic_info_24) : null;
            if (numValueOf != null) {
                ssnVar.a(numValueOf.intValue());
            }
            ssnVar.p(wpvVar.d);
            wls wlsVar = wpvVar.e;
            if (wlsVar == null) {
                wlsVar = wls.a;
            }
            ssnVar.e(wlsVar.b);
            if ((wpvVar.b & 8) != 0) {
                wpu wpuVar = wpvVar.f;
                if (wpuVar == null) {
                    wpuVar = wpu.a;
                }
                ssnVar.m(wpuVar.b, new ifx(this, wpvVar, context, i2));
            }
            if ((wpvVar.b & 16) != 0) {
                wpu wpuVar2 = wpvVar.g;
                if (wpuVar2 == null) {
                    wpuVar2 = wpu.a;
                }
                ssnVar.h(wpuVar2.b, new ifx(this, wpvVar, context, 0));
            }
            ssnVar.show();
            return;
        }
        if (i == 2) {
            vvd vvdVar3 = wqh.e;
            wkgVar.i(vvdVar3);
            Object objK3 = wkgVar.l.k((vub) vvdVar3.c);
            if (objK3 == null) {
                objK3 = vvdVar3.b;
            } else {
                vvdVar3.c(objK3);
            }
            objK3.getClass();
            Object obj2 = this.a;
            wqh wqhVar = (wqh) objK3;
            wll wllVar = wqhVar.c;
            if (wllVar == null) {
                wllVar = wll.a;
            }
            wll wllVar2 = wllVar;
            wllVar2.getClass();
            String str3 = wqhVar.d;
            str3.getClass();
            wpm wpmVar = wqhVar.b;
            if (wpmVar == null) {
                wpmVar = wpm.a;
            }
            wpm wpmVar2 = wpmVar;
            wpmVar2.getClass();
            lid.a();
            ((jan) obj2).q(context, wllVar2, str3, wpmVar2, "", false);
            return;
        }
        vvd vvdVar4 = wqi.d;
        wkgVar.i(vvdVar4);
        Object objK4 = wkgVar.l.k((vub) vvdVar4.c);
        if (objK4 == null) {
            objK4 = vvdVar4.b;
        } else {
            vvdVar4.c(objK4);
        }
        Object obj3 = this.a;
        wqi wqiVar = (wqi) objK4;
        String str4 = wqiVar.b;
        str4.getClass();
        boolean z = wqiVar.c;
        by byVarF = hju.F(context);
        if (byVarF != null) {
            lfn lfnVar = ((jan) obj3).e;
            if (!lfnVar.ci()) {
                int i3 = true == lfnVar.cJ() ? 1 : 2;
                fx fxVar = new fx((byte[]) null);
                ((Intent) fxVar.a).putExtra("androidx.browser.customtabs.extra.COLOR_SCHEME", i3);
                bhi bhiVarE = fxVar.e();
                if (z) {
                    try {
                        ((Intent) bhiVarE.a).setPackage("com.android.chrome");
                    } catch (Exception unused) {
                        Toast.makeText(context, "Unable to open browser", 1).show();
                    }
                }
                bhiVarE.r(byVarF, Uri.parse(str4));
                return;
            }
            Intent intent = new Intent().setClass(context, WebViewActivity.class);
            intent.putExtra("web_url", Uri.parse(str4).toString());
            intent.getClass();
            hju.B(intent, context);
            context.startActivity(intent);
        }
    }

    public igl(kwy kwyVar, int i) {
        this.b = i;
        kwyVar.getClass();
        this.a = kwyVar;
    }

    public igl(jan janVar, int i) {
        this.b = i;
        janVar.getClass();
        this.a = janVar;
    }

    public igl(jan janVar, int i, byte[] bArr) {
        this.b = i;
        janVar.getClass();
        this.a = janVar;
    }

    @Override // defpackage.ixf
    public final /* synthetic */ void b() {
    }
}

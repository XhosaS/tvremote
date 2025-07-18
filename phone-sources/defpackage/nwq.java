package defpackage;

import android.accounts.Account;
import android.app.Activity;
import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Picture;
import android.os.Build;
import android.os.Handler;
import android.os.Looper;
import android.util.Log;
import android.view.View;
import com.google.android.gms.auth.api.signin.GoogleSignInAccount;
import com.google.android.gms.common.api.GoogleApiActivity;
import java.util.Collections;
import java.util.Set;

/* compiled from: PG */
/* loaded from: classes2.dex */
public class nwq implements nwv {
    public final Looper A;
    public final int B;
    public final nwu C;
    protected final nzg D;
    public final jzs E;
    public final kwy F;
    private final oab a;
    public final Context w;
    public final String x;
    public final nwi y;
    public final nxn z;

    public nwq(Context context, Activity activity, jzs jzsVar, nwi nwiVar, nwp nwpVar) {
        ocv.aG(context, "Null context is not permitted.");
        ocv.aG(jzsVar, "Api must not be null.");
        ocv.aG(nwpVar, "Settings must not be null; use Settings.DEFAULT_SETTINGS instead.");
        Context applicationContext = context.getApplicationContext();
        ocv.aG(applicationContext, "The provided context did not have an application context.");
        this.w = applicationContext;
        kwy kwyVar = null;
        String attributionTag = (Build.VERSION.SDK_INT < 30 || context == null || Build.VERSION.SDK_INT < 30) ? null : context.getAttributionTag();
        this.x = attributionTag;
        if (Build.VERSION.SDK_INT >= 31 && context != null) {
            kwyVar = new kwy(context.getAttributionSource());
        }
        this.F = kwyVar;
        this.E = jzsVar;
        this.y = nwiVar;
        this.A = nwpVar.c;
        nxn nxnVar = new nxn(jzsVar, nwiVar, attributionTag);
        this.z = nxnVar;
        this.C = new nzh(this);
        nzg nzgVarC = nzg.c(applicationContext);
        this.D = nzgVarC;
        this.B = nzgVarC.j.getAndIncrement();
        this.a = nwpVar.b;
        if (activity != null && !(activity instanceof GoogleApiActivity) && Looper.myLooper() == Looper.getMainLooper()) {
            nzp nzpVarL = nye.l(activity);
            nye nyeVar = (nye) nzpVarL.b("ConnectionlessLifecycleHelper", nye.class);
            nyeVar = nyeVar == null ? new nye(nzpVarL, nzgVarC) : nyeVar;
            nyeVar.e.add(nxnVar);
            nzgVarC.f(nyeVar);
        }
        Handler handler = nzgVarC.o;
        handler.sendMessage(handler.obtainMessage(7, this));
    }

    private final onz a(int i, oag oagVar) {
        kwy kwyVar = new kwy((byte[]) null, (byte[]) null);
        int i2 = oagVar.d;
        nzg nzgVar = this.D;
        nzgVar.i(kwyVar, i2, this);
        nxk nxkVar = new nxk(i, oagVar, kwyVar, this.a);
        Handler handler = nzgVar.o;
        handler.sendMessage(handler.obtainMessage(4, new rza(nxkVar, nzgVar.k.get(), this)));
        return (onz) kwyVar.a;
    }

    public static Bitmap v(View view) {
        try {
            if (Build.VERSION.SDK_INT < 28) {
                Bitmap bitmapCreateBitmap = Bitmap.createBitmap(view.getWidth(), view.getHeight(), Bitmap.Config.RGB_565);
                view.draw(new Canvas(bitmapCreateBitmap));
                return bitmapCreateBitmap;
            }
            Picture picture = new Picture();
            Canvas canvasBeginRecording = picture.beginRecording(view.getWidth(), view.getHeight());
            canvasBeginRecording.drawRect(0.0f, 0.0f, view.getWidth(), view.getHeight(), new Paint());
            view.draw(canvasBeginRecording);
            picture.endRecording();
            return Bitmap.createBitmap(picture, view.getWidth(), view.getHeight(), Bitmap.Config.RGB_565);
        } catch (Error | Exception e) {
            Log.w("gF_FeedbackClient", "Get screenshot failed!", e);
            return null;
        }
    }

    @Override // defpackage.nwv
    public final nxn n() {
        return this.z;
    }

    public final nzt o(Object obj, String str) {
        return kwy.C(obj, this.A, str);
    }

    public final oau p() {
        GoogleSignInAccount googleSignInAccountA;
        GoogleSignInAccount googleSignInAccountA2;
        oau oauVar = new oau();
        nwi nwiVar = this.y;
        boolean z = nwiVar instanceof nwg;
        Account account = null;
        if (z && (googleSignInAccountA2 = ((nwg) nwiVar).a()) != null) {
            String str = googleSignInAccountA2.c;
            if (str != null) {
                account = new Account(str, "com.google");
            }
        } else if (nwiVar instanceof ogl) {
            account = ((ogl) nwiVar).a;
        }
        oauVar.a = account;
        Set setA = (!z || (googleSignInAccountA = ((nwg) nwiVar).a()) == null) ? Collections.EMPTY_SET : googleSignInAccountA.a();
        if (oauVar.b == null) {
            oauVar.b = new it();
        }
        oauVar.b.addAll(setA);
        Context context = this.w;
        oauVar.d = context.getClass().getName();
        oauVar.c = context.getPackageName();
        return oauVar;
    }

    public final onz q(oag oagVar) {
        return a(2, oagVar);
    }

    public final onz r(oag oagVar) {
        return a(0, oagVar);
    }

    public final onz s(nzr nzrVar, int i) {
        kwy kwyVar = new kwy((byte[]) null, (byte[]) null);
        nzg nzgVar = this.D;
        nzgVar.i(kwyVar, i, this);
        nxl nxlVar = new nxl(nzrVar, kwyVar);
        Handler handler = nzgVar.o;
        handler.sendMessage(handler.obtainMessage(13, new rza(nxlVar, nzgVar.k.get(), this)));
        return (onz) kwyVar.a;
    }

    public final onz t(oag oagVar) {
        return a(1, oagVar);
    }

    public final void u(int i, nxr nxrVar) {
        nxrVar.o();
        nxi nxiVar = new nxi(i, nxrVar);
        nzg nzgVar = this.D;
        rza rzaVar = new rza(nxiVar, nzgVar.k.get(), this);
        Handler handler = nzgVar.o;
        handler.sendMessage(handler.obtainMessage(4, rzaVar));
    }

    public final onz w() {
        oaf oafVar = new oaf();
        oafVar.a = new nku(9);
        oafVar.c = 3901;
        return r(oafVar.a());
    }

    public final onz x() {
        oaf oafVar = new oaf();
        oafVar.a = new nku(10);
        oafVar.c = 4501;
        return r(oafVar.a());
    }

    public final onz y(jzs jzsVar) {
        Object obj = jzsVar.a;
        nzx nzxVar = (nzx) obj;
        ocv.aG(nzxVar.a(), "Listener has already been released.");
        kwy kwyVar = new kwy((byte[]) null, (byte[]) null);
        int i = nzxVar.b;
        nzg nzgVar = this.D;
        nzgVar.i(kwyVar, i, this);
        nxj nxjVar = new nxj(new jzs(obj, jzsVar.c, jzsVar.b), kwyVar);
        Handler handler = nzgVar.o;
        handler.sendMessage(handler.obtainMessage(8, new rza(nxjVar, nzgVar.k.get(), this)));
        return (onz) kwyVar.a;
    }

    public nwq(Context context, jzs jzsVar, nwi nwiVar, nwp nwpVar) {
        this(context, null, jzsVar, nwiVar, nwpVar);
    }

    public nwq(Context context) {
        this(context, odx.b, nwi.q, nwp.a);
        opm.b(context.getApplicationContext());
    }

    public nwq(Context context, byte[] bArr) {
        this(context, omt.b, nwi.q, nwp.a);
    }

    public nwq(Context context, char[] cArr) {
        jzs jzsVar = ujw.a;
        nwh nwhVar = nwi.q;
        nwo nwoVar = new nwo();
        Looper mainLooper = Looper.getMainLooper();
        ocv.aG(mainLooper, "Looper must not be null.");
        nwoVar.b = mainLooper;
        nwoVar.a = new ujd(0);
        this(context, jzsVar, nwhVar, nwoVar.a());
        rxa.f(context);
    }
}

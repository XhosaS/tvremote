package defpackage;

import android.app.Activity;
import android.app.PendingIntent;
import android.app.PictureInPictureParams;
import android.app.RemoteAction;
import android.content.Context;
import android.content.Intent;
import android.graphics.Rect;
import android.graphics.drawable.Icon;
import android.util.Rational;
import com.google.android.videos.R;
import java.util.ArrayList;
import java.util.List;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class mri implements mrl {
    final /* synthetic */ mrm a;
    private final ieh b;
    private final idy c;
    private final mgc d;
    private final lks e;

    public mri(mrm mrmVar, lks lksVar, mgc mgcVar, ieh iehVar, idy idyVar) {
        this.a = mrmVar;
        this.e = lksVar;
        this.b = iehVar;
        this.c = idyVar;
        this.d = mgcVar;
        if (mrmVar.j) {
            mgcVar.addOnLayoutChangeListener(new jco(this, mrmVar, 2));
        }
    }

    private final RemoteAction h(Context context, int i, int i2, int i3) {
        PendingIntent broadcast = PendingIntent.getBroadcast(context, i, new Intent("com.google.android.videos.intent.action.pip_controllers").putExtra("PIP_ACTION_EXTRA", i).setPackage(context.getPackageName()), 201326592);
        Icon iconCreateWithResource = Icon.createWithResource(context, i2);
        Activity activity = this.a.c;
        return new RemoteAction(iconCreateWithResource, activity.getString(i3), activity.getString(i3), broadcast);
    }

    private final List i() {
        ArrayList arrayList = new ArrayList();
        Activity activity = this.a.c;
        arrayList.add(h(activity, 1, 2131231836, R.string.accessibility_seek_30s));
        if (this.e.i()) {
            arrayList.add(h(activity, 2, 2131231838, R.string.accessibility_pause));
            return arrayList;
        }
        arrayList.add(h(activity, 3, 2131231839, R.string.accessibility_play));
        return arrayList;
    }

    private final void j() {
        this.c.c(true);
        this.a.e.hide();
    }

    private final void k() {
        this.c.c(false);
        this.a.e.show();
    }

    @Override // defpackage.mrl
    public final PictureInPictureParams a() {
        PictureInPictureParams.Builder builder = new PictureInPictureParams.Builder();
        meq meqVarA = ((mry) this.b).a();
        int iCeil = meqVarA.a;
        int i = meqVarA.b;
        if (iCeil > 0 && i > 0) {
            float f = i;
            float f2 = iCeil / f;
            if (f2 > 2.39f) {
                iCeil = (int) (f * 2.39f);
            } else if (f2 < 0.41841003f) {
                iCeil = (int) Math.ceil(f * 0.41841003f);
            }
            Rational rational = new Rational(iCeil, i);
            builder.setAspectRatio(rational);
            krd.e("Enter Pip for size: " + String.valueOf(meqVarA) + " with aspect ratio: " + rational.toString() + " = " + rational.floatValue());
        }
        builder.setActions(i());
        if (this.a.j) {
            builder.setAutoEnterEnabled(true);
            Rect rect = new Rect();
            this.d.getGlobalVisibleRect(rect);
            builder.setSourceRectHint(rect);
        }
        return builder.build();
    }

    @Override // defpackage.mrl
    public final void b(int i) {
        if (i == 1) {
            this.e.q();
        } else if (i == 2) {
            this.e.n();
        } else if (i != 3) {
            krd.f(a.cf(i, "Unknown PiP action: "));
        } else {
            this.e.p();
        }
        f();
    }

    @Override // defpackage.mrl
    public final void c() {
        this.e.k();
        j();
    }

    @Override // defpackage.mrl
    public final void d() {
        this.e.l();
        k();
    }

    @Override // defpackage.mrl
    public final void e(boolean z) {
        int i;
        this.e.o(z);
        mfx mfxVar = this.d.a;
        if (mfxVar.i != z) {
            mfxVar.i = z;
            if (z) {
                mfxVar.f = mfxVar.e;
                i = 0;
            } else {
                i = mfxVar.f;
            }
            mfxVar.h(i);
            mfxVar.a.b();
        }
        if (!z) {
            k();
        } else {
            j();
            f();
        }
    }

    @Override // defpackage.mrl
    public final void f() {
        this.a.c.setPictureInPictureParams(new PictureInPictureParams.Builder().setActions(i()).build());
    }

    @Override // defpackage.mrl
    public final boolean g() {
        return this.e.h();
    }
}

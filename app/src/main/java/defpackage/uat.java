package defpackage;

import android.app.Activity;
import android.content.Context;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.google.android.katniss.R;
import java.util.Locale;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class uat extends uag implements wgt, aeiz, wjd, wwo {
    private uau c;
    private Context d;
    private final bco e = new bco(this);
    private boolean f;

    @Deprecated
    public uat() {
        uea.c();
    }

    @Override // defpackage.udh, defpackage.bq
    public final View D(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        this.b.g();
        try {
            aI(layoutInflater, viewGroup, bundle);
            L();
            View viewInflate = layoutInflater.inflate(R.layout.transcription_initialization_fragment, viewGroup, false);
            wum.n();
            return viewInflate;
        } catch (Throwable th) {
            try {
                wum.n();
            } catch (Throwable th2) {
                th.addSuppressed(th2);
            }
            throw th;
        }
    }

    @Override // defpackage.uag, defpackage.udh, defpackage.bq
    public final void W(Activity activity) {
        this.b.g();
        try {
            super.W(activity);
            wum.n();
        } catch (Throwable th) {
            try {
                wum.n();
            } catch (Throwable th2) {
                th.addSuppressed(th2);
            }
            throw th;
        }
    }

    @Override // defpackage.udh, defpackage.bq
    public final void aA() {
        ((udh) this).a.v();
        L().a();
    }

    @Override // defpackage.wgt
    /* renamed from: aC, reason: merged with bridge method [inline-methods] */
    public final uau L() {
        uau uauVar = this.c;
        if (uauVar == null) {
            throw new IllegalStateException("peer() called before initialized.");
        }
        if (this.f) {
            throw new IllegalStateException("peer() called after destroyed.");
        }
        return uauVar;
    }

    @Override // defpackage.wio, defpackage.wwo
    public final wyt aK() {
        return this.b.b;
    }

    @Override // defpackage.wjd
    public final Locale aM() {
        return wjc.a(this);
    }

    @Override // defpackage.wio, defpackage.wwo
    public final void aN(wyt wytVar, boolean z) {
        this.b.d(wytVar, z);
    }

    @Override // defpackage.wio, defpackage.wwo
    public final void aO(wyt wytVar) {
        this.b.c = wytVar;
    }

    @Override // defpackage.bq, defpackage.bcl
    public final bcg ek() {
        return this.e;
    }

    @Override // defpackage.udh, defpackage.bq
    public final void er() {
        wwt wwtVarB = this.b.b();
        try {
            aF();
            this.f = true;
            wwtVarB.close();
        } catch (Throwable th) {
            try {
                wwtVarB.close();
            } catch (Throwable th2) {
                th.addSuppressed(th2);
            }
            throw th;
        }
    }

    @Override // defpackage.bq
    public final LayoutInflater ev(Bundle bundle) {
        this.b.g();
        try {
            LayoutInflater layoutInflaterAr = ar();
            LayoutInflater layoutInflaterCloneInContext = layoutInflaterAr.cloneInContext(new aeiu(layoutInflaterAr, this));
            LayoutInflater layoutInflaterCloneInContext2 = layoutInflaterCloneInContext.cloneInContext(new wjg(this, layoutInflaterCloneInContext));
            wum.n();
            return layoutInflaterCloneInContext2;
        } catch (Throwable th) {
            try {
                wum.n();
            } catch (Throwable th2) {
                th.addSuppressed(th2);
            }
            throw th;
        }
    }

    @Override // defpackage.uag, defpackage.wio, defpackage.bq
    public final void ex(Context context) {
        this.b.g();
        try {
            if (this.f) {
                throw new IllegalStateException("A Fragment cannot be attached more than once. Instead, create a new Fragment instance.");
            }
            super.ex(context);
            if (this.c == null) {
                try {
                    wvx wvxVarD = wzg.d(uat.class, "CreateComponent");
                    try {
                        Object objDN = cO().dN();
                        wvxVarD.close();
                        wvx wvxVarD2 = wzg.d(uat.class, "CreatePeer");
                        try {
                            Activity activity = ((eth) objDN).c.a;
                            aeiv.a(activity);
                            Context context2 = (Context) ((eth) objDN).b.n.a();
                            bq bqVar = ((eth) objDN).a;
                            if (!(bqVar instanceof uat)) {
                                throw new IllegalStateException(a.B(bqVar, uau.class, "Attempt to inject a Fragment wrapper of type "));
                            }
                            uat uatVar = (uat) bqVar;
                            uatVar.getClass();
                            this.c = new uau(activity, context2, uatVar, new tuy());
                            wvxVarD2.close();
                            this.aa.b(new wir(this.b, this.e));
                        } finally {
                        }
                    } catch (Throwable th) {
                        try {
                            wvxVarD.close();
                        } catch (Throwable th2) {
                            th.addSuppressed(th2);
                        }
                        throw th;
                    }
                } catch (ClassCastException e) {
                    throw new IllegalStateException("Missing entry point. If you're in a test with explicit entry points specified in your @TestRoot, check that you're not missing the one for this class.", e);
                }
            }
            wum.n();
        } catch (Throwable th3) {
            try {
                wum.n();
            } catch (Throwable th4) {
                th3.addSuppressed(th4);
            }
            throw th3;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:18:0x0087 A[Catch: all -> 0x00c9, TryCatch #0 {all -> 0x00c9, blocks: (B:3:0x0005, B:6:0x001e, B:7:0x0038, B:10:0x0048, B:12:0x004e, B:15:0x005d, B:16:0x0076, B:18:0x0087, B:20:0x008f, B:21:0x0093, B:23:0x009d, B:25:0x00a5, B:26:0x00b7, B:27:0x00c4), top: B:36:0x0005 }] */
    @Override // defpackage.wio, defpackage.udh, defpackage.bq
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void ey(android.os.Bundle r9) {
        /*
            r8 = this;
            wua r0 = r8.b
            r0.g()
            r8.aE(r9)     // Catch: java.lang.Throwable -> Lc9
            uau r0 = r8.L()     // Catch: java.lang.Throwable -> Lc9
            java.lang.String r1 = "TranscriptionInitializationFragmentPeer.java"
            android.app.Activity r2 = r0.c     // Catch: java.lang.Throwable -> Lc9
            java.lang.String r3 = defpackage.tto.f(r2)     // Catch: java.lang.Throwable -> Lc9
            boolean r3 = r3.isEmpty()     // Catch: java.lang.Throwable -> Lc9
            java.lang.String r4 = "onCreate"
            java.lang.String r5 = "com/google/android/libraries/speech/transcription/ui/TranscriptionInitializationFragmentPeer"
            if (r3 == 0) goto L38
            zdy r9 = defpackage.uau.a     // Catch: java.lang.Throwable -> Lc9
            zeo r9 = r9.c()     // Catch: java.lang.Throwable -> Lc9
            zdv r9 = (defpackage.zdv) r9     // Catch: java.lang.Throwable -> Lc9
            r0 = 63
            zeo r9 = r9.q(r5, r4, r0, r1)     // Catch: java.lang.Throwable -> Lc9
            zdv r9 = (defpackage.zdv) r9     // Catch: java.lang.Throwable -> Lc9
            java.lang.String r0 = "ACTION_RECOGNIZE_SPEECH intent called incorrectly. Maybe you called startActivity, but you should have called startActivityForResult (or otherwise included a pending intent)."
            r9.u(r0)     // Catch: java.lang.Throwable -> Lc9
            r2.finish()     // Catch: java.lang.Throwable -> Lc9
            goto Lc5
        L38:
            android.content.Intent r3 = r2.getIntent()     // Catch: java.lang.Throwable -> Lc9
            j$.util.Optional r3 = defpackage.tto.e(r3)     // Catch: java.lang.Throwable -> Lc9
            boolean r3 = r3.isPresent()     // Catch: java.lang.Throwable -> Lc9
            java.lang.String r6 = "android.permission.RECORD_AUDIO"
            if (r3 == 0) goto L76
            android.content.ComponentName r3 = r2.getCallingActivity()     // Catch: java.lang.Throwable -> Lc9
            if (r3 == 0) goto L5d
            java.lang.String r3 = r2.getCallingPackage()     // Catch: java.lang.Throwable -> Lc9
            android.content.pm.PackageManager r7 = r2.getPackageManager()     // Catch: java.lang.Throwable -> Lc9
            int r3 = r7.checkPermission(r6, r3)     // Catch: java.lang.Throwable -> Lc9
            if (r3 != 0) goto L5d
            goto L76
        L5d:
            zdy r9 = defpackage.uau.a     // Catch: java.lang.Throwable -> Lc9
            zeo r9 = r9.c()     // Catch: java.lang.Throwable -> Lc9
            zdv r9 = (defpackage.zdv) r9     // Catch: java.lang.Throwable -> Lc9
            r0 = 76
            zeo r9 = r9.q(r5, r4, r0, r1)     // Catch: java.lang.Throwable -> Lc9
            zdv r9 = (defpackage.zdv) r9     // Catch: java.lang.Throwable -> Lc9
            java.lang.String r0 = "Calling package must have RECORD_AUDIO permission to request audio recording."
            r9.u(r0)     // Catch: java.lang.Throwable -> Lc9
            r2.finish()     // Catch: java.lang.Throwable -> Lc9
            goto Lc5
        L76:
            r1 = 2131886856(0x7f120308, float:1.9408303E38)
            java.lang.String r1 = r2.getString(r1)     // Catch: java.lang.Throwable -> Lc9
            r3 = 1
            android.widget.Toast r1 = android.widget.Toast.makeText(r2, r1, r3)     // Catch: java.lang.Throwable -> Lc9
            r1.show()     // Catch: java.lang.Throwable -> Lc9
            if (r9 != 0) goto Lc5
            android.content.Context r9 = r0.d     // Catch: java.lang.Throwable -> Lc9
            int r9 = defpackage.abw.a(r9, r6)     // Catch: java.lang.Throwable -> Lc9
            if (r9 != 0) goto L93
            r0.a()     // Catch: java.lang.Throwable -> Lc9
            goto Lc5
        L93:
            uat r9 = r0.b     // Catch: java.lang.Throwable -> Lc9
            java.lang.String[] r0 = new java.lang.String[]{r6}     // Catch: java.lang.Throwable -> Lc9
            ce r1 = r9.D     // Catch: java.lang.Throwable -> Lc9
            if (r1 == 0) goto Lb7
            de r1 = r9.eh()     // Catch: java.lang.Throwable -> Lc9
            ur r2 = r1.s     // Catch: java.lang.Throwable -> Lc9
            if (r2 == 0) goto Lc5
            android.support.v4.app.FragmentManager$LaunchedFragmentInfo r2 = new android.support.v4.app.FragmentManager$LaunchedFragmentInfo     // Catch: java.lang.Throwable -> Lc9
            java.lang.String r9 = r9.m     // Catch: java.lang.Throwable -> Lc9
            r2.<init>(r9, r3)     // Catch: java.lang.Throwable -> Lc9
            java.util.ArrayDeque r9 = r1.t     // Catch: java.lang.Throwable -> Lc9
            r9.addLast(r2)     // Catch: java.lang.Throwable -> Lc9
            ur r9 = r1.s     // Catch: java.lang.Throwable -> Lc9
            r9.b(r0)     // Catch: java.lang.Throwable -> Lc9
            goto Lc5
        Lb7:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException     // Catch: java.lang.Throwable -> Lc9
            java.lang.String r1 = "Fragment "
            java.lang.String r2 = " not attached to Activity"
            java.lang.String r9 = defpackage.a.c(r9, r1, r2)     // Catch: java.lang.Throwable -> Lc9
            r0.<init>(r9)     // Catch: java.lang.Throwable -> Lc9
            throw r0     // Catch: java.lang.Throwable -> Lc9
        Lc5:
            defpackage.wum.n()
            return
        Lc9:
            r9 = move-exception
            defpackage.wum.n()     // Catch: java.lang.Throwable -> Lce
            goto Ld2
        Lce:
            r0 = move-exception
            r9.addSuppressed(r0)
        Ld2:
            throw r9
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.uat.ey(android.os.Bundle):void");
    }

    @Override // defpackage.uag
    protected final /* synthetic */ aeik m() {
        return new wjj(this);
    }

    @Override // defpackage.uag, defpackage.bq
    public final Context s() {
        if (super.s() == null) {
            return null;
        }
        if (this.d == null) {
            this.d = new wjg(this, super.s());
        }
        return this.d;
    }
}

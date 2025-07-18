package com.google.android.apps.play.movies.common.presenter.activity;

import android.content.Context;
import android.content.DialogInterface;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.content.res.TypedArray;
import android.net.Uri;
import android.os.Bundle;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.View;
import android.widget.LinearLayout;
import defpackage.by;
import defpackage.idb;
import defpackage.ieg;
import defpackage.ieh;
import defpackage.isy;
import defpackage.jwq;
import defpackage.kgu;
import defpackage.kpz;
import defpackage.kqc;
import defpackage.kqd;
import defpackage.krd;
import defpackage.ksl;
import defpackage.ksn;
import defpackage.ksy;
import defpackage.ktw;
import defpackage.kwy;
import defpackage.ldc;
import defpackage.ldd;
import defpackage.lde;
import defpackage.ldf;
import defpackage.ldv;
import defpackage.lfn;
import defpackage.lid;
import defpackage.lie;
import defpackage.lkt;
import defpackage.lnt;
import defpackage.lrc;
import defpackage.lzc;
import defpackage.lze;
import defpackage.mab;
import defpackage.mjo;
import defpackage.mta;
import defpackage.wae;
import defpackage.xby;
import defpackage.xcd;
import defpackage.xce;
import java.util.concurrent.Executor;
import java.util.concurrent.ExecutorService;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class ApiActivity extends by implements DialogInterface.OnCancelListener, xce {
    public ksn a;
    public String b;
    public ksy c;
    public boolean d;
    public String e = "";
    public int f = 0;
    public lze g;
    public ldv h;
    public lfn i;
    public idb j;
    public mab k;
    public ieh l;
    public xcd m;
    public lie n;
    public kpz o;
    public lid p;
    public lkt q;
    public mta r;
    public kwy s;
    public isy t;
    private boolean u;
    private int v;

    /* compiled from: PG */
    public class MaxWidthLinearLayout extends LinearLayout {
        private final int a;

        public MaxWidthLinearLayout(Context context) {
            this(context, null);
        }

        @Override // android.widget.LinearLayout, android.view.View
        protected final void onMeasure(int i, int i2) {
            int i3 = this.a;
            int size = View.MeasureSpec.getSize(i);
            if (i3 > 0 && i3 < size) {
                i = View.MeasureSpec.makeMeasureSpec(i3, View.MeasureSpec.getMode(i));
            }
            super.onMeasure(i, i2);
        }

        public MaxWidthLinearLayout(Context context, AttributeSet attributeSet) {
            super(context, attributeSet);
            TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, ksl.a);
            this.a = typedArrayObtainStyledAttributes.getDimensionPixelSize(0, 0);
            typedArrayObtainStyledAttributes.recycle();
        }
    }

    private final void e() {
        if (this.h.s(this.a)) {
            if (this.j.a()) {
                this.o.k(this, null);
                a(2, new Throwable());
                return;
            } else {
                lze lzeVar = this.g;
                lzeVar.f = mjo.e(new lnt(lzeVar, 6), new kqd(lzeVar, 7), lzeVar.a);
                return;
            }
        }
        ksn ksnVar = this.a;
        Bundle bundle = new Bundle();
        bundle.putString("authAccount", ksnVar.a);
        ldc ldcVar = new ldc();
        ldcVar.setArguments(bundle);
        ldcVar.show(getSupportFragmentManager(), "AddAccountDialog");
    }

    public final void a(int i, Throwable th) {
        this.n.u(this.f, this.b, this.e, th);
        setResult(i);
        finish();
    }

    @Override // defpackage.xce
    public final xby<Object> androidInjector() {
        return this.m;
    }

    public final void b() {
        this.n.v(this.f, this.b, this.e);
        setResult(-1);
        finish();
    }

    public final void c(int i) {
        this.n.at(i, this.c, 18, this.e);
    }

    public final void d(int i) {
        this.v = i;
        if (this.u) {
            return;
        }
        if (i == 1) {
            new ldd().show(getSupportFragmentManager(), "ProgressDialogFragment");
        } else if (i == 2) {
            ldd.a(this);
            new lde().show(getSupportFragmentManager(), "NotFoundDialog");
        } else if (i != 3) {
            ksn ksnVar = this.a;
            String str = this.c.b;
            String str2 = this.e;
            String callingPackage = getCallingPackage();
            lid lidVar = this.p;
            this.n.Z(str, str2);
            Bundle bundle = new Bundle();
            bundle.putString("authAccount", ksnVar.a);
            bundle.putString("video_id", str);
            bundle.putString("CALLING_PACKAGE", callingPackage);
            bundle.putParcelable("parent_event_id", lidVar);
            ldf ldfVar = new ldf();
            ldfVar.setArguments(bundle);
            ldfVar.show(getSupportFragmentManager(), "PostPurchaseDialog");
        } else {
            e();
        }
        this.v = 0;
    }

    @Override // defpackage.by, defpackage.fl, android.app.Activity
    protected final void onActivityResult(int i, int i2, Intent intent) {
        if (i == 906) {
            a(3, new Throwable());
            return;
        }
        if (i == 903) {
            if (i2 == -1) {
                d(3);
                return;
            } else {
                a(i2, new Throwable());
                return;
            }
        }
        kwy kwyVar = this.s;
        if (kwyVar == null || !kwyVar.e(i, i2, intent)) {
            super.onActivityResult(i, i2, intent);
            return;
        }
        if (i2 != -1) {
            c(12);
            a(0, new Throwable());
            return;
        }
        c(-1);
        if (this.d) {
            d(4);
        } else {
            b();
        }
    }

    @Override // android.content.DialogInterface.OnCancelListener
    public final void onCancel(DialogInterface dialogInterface) {
        a(3, new Throwable());
    }

    /* JADX WARN: Type inference failed for: r0v18, types: [java.lang.Object, yfo] */
    /* JADX WARN: Type inference failed for: r2v5, types: [java.lang.Object, yfo] */
    /* JADX WARN: Type inference failed for: r3v2, types: [java.lang.Object, yfo] */
    /* JADX WARN: Type inference failed for: r9v15, types: [java.lang.Object, yfo] */
    @Override // defpackage.by, defpackage.fl, defpackage.ds, android.app.Activity
    protected final void onCreate(Bundle bundle) {
        int i;
        wae.y(this);
        super.onCreate(bundle);
        if (ktw.e(this, this)) {
            return;
        }
        this.o = ((kqc) getApplication()).b();
        PackageManager packageManager = getPackageManager();
        boolean zCW = this.i.cW();
        String strX = kgu.x(getCallingPackage(), packageManager);
        this.e = strX;
        if (TextUtils.isEmpty(strX)) {
            a(1, new Throwable());
            return;
        }
        lkt lktVar = this.q;
        String str = this.e;
        ieg iegVar = ieg.a;
        this.p = lktVar.b(str, iegVar, iegVar);
        Intent intent = getIntent();
        String action = intent.getAction();
        this.f = 0;
        if ("com.google.android.videos.intent.action.PURCHASE".equals(action)) {
            this.f = 4;
        } else if (!zCW) {
            int iHashCode = action.hashCode();
            if (iHashCode != -1846863993) {
                if (iHashCode != -994104448) {
                    if (iHashCode == -752464247 && action.equals("com.google.android.videos.intent.action.PLAY")) {
                        this.f = 1;
                    }
                } else if (action.equals("com.google.android.videos.intent.action.PIN")) {
                    i = 2;
                    this.f = i;
                }
            } else if (action.equals("com.google.android.videos.intent.action.UNPIN")) {
                i = 3;
                this.f = i;
            }
        }
        if (this.f == 0) {
            krd.c("Unexpected action: ".concat(String.valueOf(action)));
            a(1, new Throwable());
            return;
        }
        Uri data = intent.getData();
        if (data == null) {
            a(1, new Throwable());
            return;
        }
        String queryParameter = data.getQueryParameter("eidr");
        String str2 = null;
        if (queryParameter != null) {
            String strReplaceAll = queryParameter.replaceAll("[\\.\\-/]", "");
            if (strReplaceAll.length() > 0) {
                str2 = strReplaceAll;
            }
        }
        this.b = str2;
        if (!jwq.P(str2)) {
            if (str2 != null && str2.length() > 27) {
                this.b = str2.substring(0, Math.min(str2.length(), 54));
            }
            a(1, new Throwable());
            return;
        }
        ieg iegVarA = ksn.a(intent.getStringExtra("authAccount"));
        if (iegVarA.k()) {
            a(1, new Throwable());
            return;
        }
        ksn ksnVar = (ksn) iegVarA.g();
        this.a = ksnVar;
        isy isyVar = this.t;
        String str3 = this.b;
        ExecutorService executorService = (ExecutorService) isyVar.a.b();
        executorService.getClass();
        Executor executor = (Executor) isyVar.d.b();
        executor.getClass();
        Object objB = isyVar.c.b();
        lrc lrcVar = (lrc) isyVar.b.b();
        lrcVar.getClass();
        ksnVar.getClass();
        str3.getClass();
        this.g = new lze(executorService, executor, (lzc) objB, lrcVar, ksnVar, str3, this);
        e();
    }

    @Override // defpackage.by, android.app.Activity
    protected final void onPause() {
        super.onPause();
        this.u = true;
    }

    @Override // defpackage.by
    protected final void onResumeFragments() {
        super.onResumeFragments();
        this.u = false;
        int i = this.v;
        if (i != 0) {
            d(i);
        }
    }
}

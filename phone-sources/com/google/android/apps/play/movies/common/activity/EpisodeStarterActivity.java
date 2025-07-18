package com.google.android.apps.play.movies.common.activity;

import android.content.Context;
import android.content.DialogInterface;
import android.content.Intent;
import android.os.Bundle;
import defpackage.by;
import defpackage.idf;
import defpackage.idy;
import defpackage.ieg;
import defpackage.ieh;
import defpackage.jwq;
import defpackage.kgu;
import defpackage.kpz;
import defpackage.kqc;
import defpackage.kra;
import defpackage.ksy;
import defpackage.ktw;
import defpackage.kwy;
import defpackage.ldv;
import defpackage.lfx;
import defpackage.lid;
import defpackage.llt;
import defpackage.llu;
import defpackage.lxo;
import defpackage.lys;
import defpackage.mfb;
import defpackage.mie;
import defpackage.mjo;
import defpackage.trk;
import defpackage.wae;
import defpackage.xag;
import defpackage.xax;
import defpackage.xaz;
import defpackage.xby;
import defpackage.xcd;
import defpackage.xce;
import java.util.Collections;
import java.util.Locale;
import java.util.concurrent.Executor;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class EpisodeStarterActivity extends by implements DialogInterface.OnCancelListener, idy, ieh, xce {
    public Executor a;
    public idf b;
    public ldv c;
    public xcd d;
    public lys e;
    public lfx f;
    public kwy g;
    private idf h;
    private ksy i;
    private mfb j;

    public static Intent episodeStarterActivityIntent(Context context, ksy ksyVar, String str, lid lidVar) {
        return kgu.y(new Intent(context, (Class<?>) EpisodeStarterActivity.class), str).putExtra("asset_id", ksyVar).putExtra("parent_event_id", lidVar);
    }

    @Override // defpackage.ieh
    public final /* synthetic */ Object a() {
        String strC = this.e.c(this.c.a());
        ksy ksyVar = this.i;
        ieg iegVarC = (ksyVar.c.length() <= 1800 ? ieg.f(new lxo(Collections.singleton(ksyVar), strC, 512, Locale.getDefault(), this.f.a(this.c.a()).c)) : ieg.b(new IllegalArgumentException())).c(this.b);
        if (iegVarC.k()) {
            iegVarC.p();
            return iegVarC;
        }
        for (xax xaxVar : ((xag) iegVarC.g()).c) {
            String str = this.i.b;
            xaz xazVar = xaxVar.c;
            if (xazVar == null) {
                xazVar = xaz.a;
            }
            if (str.equals(xazVar.c)) {
                int i = xaxVar.b;
                if ((i & 2) != 0 && (i & 4) != 0) {
                    return ieg.f(xaxVar);
                }
            }
        }
        return ieg.a;
    }

    @Override // defpackage.xce
    public final xby<Object> androidInjector() {
        return this.d;
    }

    /* JADX WARN: Type inference failed for: r9v8, types: [java.lang.CharSequence, java.lang.Object] */
    @Override // defpackage.idy
    public final /* synthetic */ void c(Object obj) {
        ieg iegVar = (ieg) obj;
        kpz kpzVarB = ((kqc) getApplication()).b();
        if (iegVar.l()) {
            ((mie) kpzVarB).k(this, "");
        } else if (iegVar.k()) {
            jwq.U(this, this.h.b(new llt(this.g.f(iegVar.i(), true), -1, iegVar.i(), false, false, trk.a)), 0);
        } else {
            xax xaxVar = (xax) iegVar.g();
            String str = this.i.b;
            xaz xazVar = xaxVar.d;
            if (xazVar == null) {
                xazVar = xaz.a;
            }
            String str2 = xazVar.c;
            xaz xazVar2 = xaxVar.f;
            if (xazVar2 == null) {
                xazVar2 = xaz.a;
            }
            kpzVarB.b(this, str, str2, xazVar2.c);
        }
        finish();
    }

    @Override // android.app.Activity
    public final void finish() {
        mfb mfbVar = this.j;
        if (mfbVar != null) {
            mfbVar.a();
        }
        super.finish();
    }

    @Override // android.content.DialogInterface.OnCancelListener
    public final void onCancel(DialogInterface dialogInterface) {
        finish();
    }

    @Override // defpackage.by, defpackage.fl, defpackage.ds, android.app.Activity
    protected final void onCreate(Bundle bundle) {
        wae.y(this);
        super.onCreate(bundle);
        if (ktw.e(this, this)) {
            return;
        }
        this.h = new llu(getResources());
        Intent intent = getIntent();
        this.i = (ksy) intent.getParcelableExtra("asset_id");
        lid.b(intent);
        kgu.A(intent);
        new kra().show(getSupportFragmentManager(), "ProgressDialogFragment");
        this.j = mjo.e(this, this, this.a);
    }

    @Override // defpackage.by, android.app.Activity
    protected final void onPause() {
        super.onPause();
        finish();
    }
}

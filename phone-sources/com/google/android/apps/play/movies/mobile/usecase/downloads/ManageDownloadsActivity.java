package com.google.android.apps.play.movies.mobile.usecase.downloads;

import android.content.Context;
import android.content.Intent;
import android.support.v7.widget.RecyclerView;
import android.view.View;
import com.google.android.apps.play.movies.mobileux.component.playheaderlist.PlayHeaderListLayout;
import defpackage.ids;
import defpackage.iea;
import defpackage.ieg;
import defpackage.iej;
import defpackage.jwq;
import defpackage.krd;
import defpackage.ldy;
import defpackage.lfn;
import defpackage.lid;
import defpackage.lie;
import defpackage.lin;
import defpackage.lxj;
import defpackage.mbf;
import defpackage.mbk;
import defpackage.mem;
import defpackage.mij;
import defpackage.mnl;
import defpackage.mnr;
import defpackage.mta;
import defpackage.mty;
import defpackage.nqq;
import defpackage.rmp;
import defpackage.rmr;
import java.io.FileDescriptor;
import java.io.PrintWriter;
import java.util.List;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class ManageDownloadsActivity extends mij implements iej {
    public iea b;
    public lxj c;
    public iea d;
    public mem e;
    public lie f;
    public lfn g;
    public nqq h;
    public mbk i;
    public mta j;
    private mbf k;
    private PlayHeaderListLayout l;
    private mnr m;
    private RecyclerView n;
    private View o;
    private mty p;
    private ids q;
    private iea r;
    private iea s;
    private iea t;
    private lin u;

    public static Intent createIntent(Context context, lid lidVar) {
        return new Intent(context, (Class<?>) ManageDownloadsActivity.class).setFlags(268435456).putExtra("parent_event_id", lidVar);
    }

    @Override // defpackage.iej
    public final void dM() {
        mnl mnlVar = (mnl) this.r.a();
        mnr mnrVar = this.m;
        if (!mnlVar.equals(mnrVar.a)) {
            mnrVar.a = mnlVar;
            mnrVar.b.eb();
        }
        int iIntValue = this.k.a().intValue();
        switch (iIntValue) {
            case 0:
            case 1:
            case 5:
                this.o.setVisibility(8);
                this.n.setVisibility(8);
                break;
            case 2:
            case 3:
            case 4:
            case 6:
            case 7:
            case 8:
                ieg iegVar = (ieg) this.t.a();
                if (!iegVar.m()) {
                    this.n.setVisibility(8);
                    this.o.setVisibility(0);
                    break;
                } else if (!((List) iegVar.g()).isEmpty()) {
                    this.n.setVisibility(0);
                    this.o.setVisibility(8);
                    this.p.i(false);
                    break;
                } else {
                    this.n.setVisibility(0);
                    this.o.setVisibility(8);
                    this.p.i(true);
                    break;
                }
        }
        krd.e("Sync state " + iIntValue + ", " + String.valueOf(((ldy) this.s).a()));
        if (iIntValue == 5) {
            finish();
        }
    }

    @Override // defpackage.by, android.app.Activity
    public final void dump(String str, FileDescriptor fileDescriptor, PrintWriter printWriter, String[] strArr) {
        super.dump(str, fileDescriptor, printWriter, strArr);
        jwq.V(printWriter);
    }

    /* JADX WARN: Removed duplicated region for block: B:13:0x00d7  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x00ef  */
    /* JADX WARN: Type inference failed for: r0v14, types: [java.lang.Object, yfo] */
    /* JADX WARN: Type inference failed for: r2v22, types: [iec, ied, iee] */
    /* JADX WARN: Type inference failed for: r2v31, types: [iec, ied] */
    /* JADX WARN: Type inference failed for: r2v32, types: [iec, ied] */
    /* JADX WARN: Type inference failed for: r2v37, types: [iec, ied, iee] */
    /* JADX WARN: Type inference failed for: r2v4, types: [java.lang.Object, yfo] */
    /* JADX WARN: Type inference failed for: r5v0, types: [java.lang.Object, yfo] */
    @Override // defpackage.mij, defpackage.xcf, defpackage.by, defpackage.fl, defpackage.ds, android.app.Activity
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void onCreate(android.os.Bundle r28) {
        /*
            Method dump skipped, instructions count: 1059
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.apps.play.movies.mobile.usecase.downloads.ManageDownloadsActivity.onCreate(android.os.Bundle):void");
    }

    @Override // defpackage.by, android.app.Activity
    public final void onPause() {
        super.onPause();
        this.u.f();
    }

    @Override // defpackage.by, android.app.Activity
    public final void onResume() {
        super.onResume();
        this.u.j();
        this.u.g();
        rmr.a().d(new rmp("ManageDownloadsOnResume"));
    }

    @Override // android.support.v7.app.AppCompatActivity, defpackage.by, android.app.Activity
    public final void onStart() {
        super.onStart();
        this.q.ea(this);
        dM();
    }

    @Override // android.support.v7.app.AppCompatActivity, defpackage.by, android.app.Activity
    public final void onStop() {
        super.onStop();
        this.n.setVisibility(8);
        this.o.setVisibility(8);
        this.q.ee(this);
    }
}

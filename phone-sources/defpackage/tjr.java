package defpackage;

import android.content.Context;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.os.Handler;
import android.util.Log;
import java.util.UUID;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class tjr extends tjk implements nws, nwt {
    public final nwu e;
    private int f;
    private final Handler g;
    private final Runnable h;
    private final tjj i;

    public tjr(Context context, tkm tkmVar, zft zftVar, Handler handler) {
        super(context, tkmVar, zftVar, handler);
        this.g = new Handler();
        this.h = new tci(this, 11, null);
        this.i = new tjq(this, this, zftVar);
        SharedPreferences sharedPreferences = context.getSharedPreferences("com.google.android.android.tv.remote.PREFERENCES", 0);
        if (sharedPreferences.getString("uid", null) == null) {
            String string = UUID.randomUUID().toString();
            SharedPreferences.Editor editorEdit = sharedPreferences.edit();
            editorEdit.putString("uid", string);
            if (!editorEdit.commit()) {
                Log.e("AtvRemote.NbConstants", "Failed to save device info!");
            }
        }
        this.f = 0;
        nwr nwrVar = new nwr(context);
        nwrVar.b(ohk.a);
        nwu nwuVarA = nwrVar.a();
        this.e = nwuVarA;
        ((nyw) nwuVarA).c.b(this);
        ((nyw) nwuVarA).c.c(this);
        nwuVarA.d();
    }

    private final void e() {
        int i = this.f;
        if (i >= 5) {
            this.i.a(new RuntimeException("cannot connect GoogleApiClient"));
            return;
        }
        this.f = i + 1;
        Handler handler = this.g;
        Runnable runnable = this.h;
        handler.removeCallbacks(runnable);
        handler.postDelayed(runnable, 1000L);
    }

    @Override // defpackage.tjo
    public final void a() {
        nwu nwuVar = this.e;
        if (nwuVar.g()) {
            nwuVar.e();
        }
        this.g.removeCallbacks(this.h);
    }

    @Override // defpackage.nzw
    public final void aC(nve nveVar) {
        Log.e("AtvRemote.NearbyDevice", "GoogleApiClient: connection failed ".concat(String.valueOf(String.valueOf(nveVar))));
        e();
    }

    @Override // defpackage.nyc
    public final void aD(Bundle bundle) {
        throw null;
    }

    @Override // defpackage.tjo
    public final void b(tms tmsVar) {
        Log.e("AtvRemote.NearbyDevice", "sendMessage: trying to messages to an null client");
        nwu nwuVar = this.e;
        if (!nwuVar.g() || nwuVar.h()) {
            return;
        }
        Log.e("AtvRemote.NearbyDevice", "sendMessage: retry GoogleApiClient connection");
        e();
    }

    @Override // defpackage.tjo
    public final void d(String str) {
        this.i.d();
    }

    @Override // defpackage.nyc
    public final void aE(int i) {
    }
}

package com.google.android.gms.cast.framework;

import android.app.Service;
import android.content.Intent;
import android.os.IBinder;
import android.os.RemoteException;
import defpackage.nmg;
import defpackage.nnb;
import defpackage.nni;
import defpackage.noe;
import defpackage.nsf;
import defpackage.ocv;
import defpackage.odc;
import defpackage.odd;

/* compiled from: PG */
/* loaded from: classes2.dex */
public class ReconnectionService extends Service {
    private nnb a;

    static {
        new nsf("ReconnectionService");
    }

    @Override // android.app.Service
    public final IBinder onBind(Intent intent) {
        nnb nnbVar = this.a;
        if (nnbVar != null) {
            try {
                return nnbVar.b(intent);
            } catch (RemoteException unused) {
                nsf.e();
            }
        }
        return null;
    }

    @Override // android.app.Service
    public final void onCreate() {
        odd oddVarB;
        odd oddVarA;
        nmg nmgVarD = nmg.d(this);
        nnb nnbVarC = null;
        try {
            oddVarB = nmgVarD.h().b.b();
        } catch (RemoteException unused) {
            nsf.e();
            oddVarB = null;
        }
        ocv.aC();
        try {
            oddVarA = nmgVarD.e.a.a();
        } catch (RemoteException unused2) {
            nsf.e();
            oddVarA = null;
        }
        int i = noe.a;
        if (oddVarB != null && oddVarA != null) {
            try {
                nnbVarC = noe.a(getApplicationContext()).c(new odc(this), oddVarB, oddVarA);
            } catch (RemoteException | nni unused3) {
                nsf.e();
            }
        }
        this.a = nnbVarC;
        if (nnbVarC != null) {
            try {
                nnbVarC.c();
            } catch (RemoteException unused4) {
                nsf.e();
            }
            super.onCreate();
        }
    }

    @Override // android.app.Service
    public final void onDestroy() {
        nnb nnbVar = this.a;
        if (nnbVar != null) {
            try {
                nnbVar.d();
            } catch (RemoteException unused) {
                nsf.e();
            }
            super.onDestroy();
        }
    }

    @Override // android.app.Service
    public final int onStartCommand(Intent intent, int i, int i2) {
        nnb nnbVar = this.a;
        if (nnbVar != null) {
            try {
                return nnbVar.a(intent, i, i2);
            } catch (RemoteException unused) {
                nsf.e();
            }
        }
        return 2;
    }
}

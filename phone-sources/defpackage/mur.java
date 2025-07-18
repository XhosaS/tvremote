package defpackage;

import android.os.Parcelable;
import com.google.android.gms.auth.TokenData;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class mur implements Parcelable.Creator {
    private final /* synthetic */ int a;

    public mur(int i) {
        this.a = i;
    }

    /*  JADX ERROR: NullPointerException in pass: InitCodeVariables
        java.lang.NullPointerException: Cannot invoke "jadx.core.dex.instructions.args.SSAVar.getPhiList()" because "resultVar" is null
        	at jadx.core.dex.visitors.InitCodeVariables.collectConnectedVars(InitCodeVariables.java:119)
        	at jadx.core.dex.visitors.InitCodeVariables.setCodeVar(InitCodeVariables.java:82)
        	at jadx.core.dex.visitors.InitCodeVariables.initCodeVar(InitCodeVariables.java:74)
        	at jadx.core.dex.visitors.InitCodeVariables.initCodeVars(InitCodeVariables.java:48)
        	at jadx.core.dex.visitors.InitCodeVariables.visit(InitCodeVariables.java:29)
        */
    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ java.lang.Object createFromParcel(android.os.Parcel r19) {
        /*
            Method dump skipped, instructions count: 840
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.mur.createFromParcel(android.os.Parcel):java.lang.Object");
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object[] newArray(int i) {
        switch (this.a) {
            case 0:
                return new mus[i];
            case 1:
                return new muq[i];
            case 2:
                return new mvf[i];
            case 3:
                return new mvg[i];
            case 4:
                return new mvs[i];
            case 5:
                return new mxa[i];
            case 6:
                return new mxb[i];
            case 7:
                return new mye[i];
            case 8:
                return new mys[i];
            case 9:
                return new mzb[i];
            case 10:
                return new mzf[i];
            case 11:
                return new mzg[i];
            case 12:
                return new ngb[i];
            case 13:
                return new ngd[i];
            case 14:
                return new ngf[i];
            case 15:
                return new nhn[i];
            case 16:
                return new TokenData[i];
            case 17:
                return new nhs[i];
            case 18:
                return new nhp[i];
            case 19:
                return new nhq[i];
            default:
                return new nhr[i];
        }
    }
}

package defpackage;

import android.content.Context;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Looper;
import android.support.v7.appcompat.R;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class ujw extends obe {
    public static final jzs a;
    private static final npj b;
    private static final ocv c;

    static {
        npj npjVar = new npj(null);
        b = npjVar;
        ujv ujvVar = new ujv();
        c = ujvVar;
        a = new jzs("AppIndexing.API", (ocv) ujvVar, npjVar);
    }

    public ujw(Context context, Looper looper, oav oavVar, nws nwsVar, nwt nwtVar) {
        super(context, looper, R.styleable.AppCompatTheme_toolbarStyle, oavVar, nwsVar, nwtVar);
    }

    @Override // defpackage.obe, defpackage.oat, defpackage.nwj
    public final int a() {
        return 12600000;
    }

    @Override // defpackage.oat
    protected final /* synthetic */ IInterface b(IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        IInterface iInterfaceQueryLocalInterface = iBinder.queryLocalInterface("com.google.firebase.appindexing.internal.IAppIndexingService");
        return iInterfaceQueryLocalInterface instanceof ukc ? (ukc) iInterfaceQueryLocalInterface : new ukc(iBinder);
    }

    @Override // defpackage.oat
    protected final String c() {
        return "com.google.firebase.appindexing.internal.IAppIndexingService";
    }

    @Override // defpackage.oat
    protected final String d() {
        return "com.google.android.gms.icing.APP_INDEXING_SERVICE";
    }

    @Override // defpackage.oat
    public final boolean f() {
        return true;
    }
}

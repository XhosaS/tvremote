package defpackage;

import android.database.ContentObserver;
import android.net.Uri;
import java.util.concurrent.Executor;

/* compiled from: PG */
/* loaded from: classes2.dex */
public abstract class vww extends ContentObserver {
    private final wxc a;
    private final String b;
    private final Executor c;

    protected vww(wxc wxcVar, String str, Executor executor) {
        super(null);
        this.a = wxcVar;
        this.b = str;
        this.c = executor;
    }

    private final void b(final boolean z, final Uri uri) {
        this.c.execute(wyo.h(new Runnable() { // from class: vwv
            @Override // java.lang.Runnable
            public final void run() {
                this.a.a(z, uri);
            }
        }));
    }

    public abstract void a(boolean z, Uri uri);

    @Override // android.database.ContentObserver
    public final void onChange(boolean z) {
        if (wum.t()) {
            b(z, null);
            return;
        }
        wvl wvlVarD = this.a.d("com/google/apps/tiktok/dataservice/AsyncContentObserver", "onChange", 51, this.b, wwb.a);
        try {
            b(z, null);
            wvlVarD.close();
        } finally {
        }
    }

    @Override // android.database.ContentObserver
    public final void onChange(boolean z, Uri uri) {
        if (wum.t()) {
            b(z, uri);
            return;
        }
        wvl wvlVarD = this.a.d("com/google/apps/tiktok/dataservice/AsyncContentObserver", "onChange", 64, this.b, wwb.a);
        try {
            b(z, uri);
            wvlVarD.close();
        } finally {
        }
    }
}

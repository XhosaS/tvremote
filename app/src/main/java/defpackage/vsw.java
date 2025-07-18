package defpackage;

import android.content.ContentProviderClient;
import android.content.Context;
import android.content.OperationApplicationException;
import android.content.pm.PackageManager;
import android.content.pm.ProviderInfo;
import android.database.Cursor;
import android.net.Uri;
import android.os.Build;
import android.os.CancellationSignal;
import android.os.RemoteException;
import java.io.FileNotFoundException;
import java.util.Arrays;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class vsw {
    public final Context a;
    private final PackageManager b;

    public vsw(Context context, PackageManager packageManager) {
        this.a = context;
        this.b = packageManager;
    }

    public static String d(String[] strArr, Uri uri, String str, String str2) {
        StringBuilder sb = new StringBuilder("SELECT ");
        sb.append(Arrays.toString(strArr));
        sb.append(" FROM ");
        sb.append(uri.getAuthority());
        if (str != null) {
            sb.append(" WHERE ");
            sb.append(str);
        }
        if (str2 != null) {
            sb.append(" ORDER BY ");
            sb.append(str2);
        }
        return sb.toString();
    }

    private final ContentProviderClient e(final Uri uri) throws vss, vsv {
        String authority = uri.getAuthority();
        yrp yrpVar = new yrp() { // from class: vsg
            @Override // defpackage.yrp
            public final Object eV() {
                int i = Build.VERSION.SDK_INT;
                Context contextCreateAttributionContext = this.a.a;
                if (i >= 30) {
                    wvy wvyVarB = wum.b(wum.c().c, vpu.a);
                    if (wvyVarB.b()) {
                        contextCreateAttributionContext = contextCreateAttributionContext.createAttributionContext((String) wvyVarB.a());
                    }
                }
                return contextCreateAttributionContext.getContentResolver().acquireUnstableContentProviderClient(uri);
            }
        };
        Object obj = null;
        try {
            Object objEV = yrpVar.eV();
            e = null;
            obj = objEV;
        } catch (SecurityException e) {
            e = e;
        }
        if (obj != null) {
            return (ContentProviderClient) obj;
        }
        ProviderInfo providerInfoResolveContentProvider = this.b.resolveContentProvider(authority, 786944);
        if (providerInfoResolveContentProvider == null) {
            throw new vss(authority, e);
        }
        throw new vsv(providerInfoResolveContentProvider, e);
    }

    public final Cursor a(Uri uri, String[] strArr, vsn vsnVar, yrp yrpVar) throws Exception {
        strArr.getClass();
        uri.getClass();
        ContentProviderClient contentProviderClientE = e(uri);
        try {
            Cursor cursorA = vsnVar.a(contentProviderClientE);
            if (cursorA != null) {
                return new vso(cursorA, contentProviderClientE);
            }
            throw new vst("Null returned from query: " + ((String) yrpVar.eV()));
        } catch (RemoteException e) {
            e = e;
            vse.a(contentProviderClientE);
            throw new vsp(e);
        } catch (Error e2) {
            vse.a(contentProviderClientE);
            throw e2;
        } catch (RuntimeException e3) {
            e = e3;
            vse.a(contentProviderClientE);
            throw new vsp(e);
        } catch (vst e4) {
            e = e4;
            vse.a(contentProviderClientE);
            throw new vsp(e);
        }
    }

    public final Object b(Uri uri, vsu vsuVar) throws Exception {
        ContentProviderClient contentProviderClientE = e(uri);
        try {
            try {
                return vsuVar.a(contentProviderClientE);
            } catch (OperationApplicationException | RemoteException | FileNotFoundException | RuntimeException e) {
                throw new vsp(e);
            }
        } finally {
            vse.a(contentProviderClientE);
        }
    }

    public final Cursor c(final Uri uri, final String[] strArr, final CancellationSignal cancellationSignal) {
        return a(uri, strArr, new vsn() { // from class: vsk
            @Override // defpackage.vsn
            public final Cursor a(ContentProviderClient contentProviderClient) {
                return contentProviderClient.query(uri, strArr, null, null, null, cancellationSignal);
            }
        }, new yrp() { // from class: vsl
            @Override // defpackage.yrp
            public final Object eV() {
                return vsw.d(strArr, uri, null, null);
            }
        });
    }
}

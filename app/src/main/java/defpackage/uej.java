package defpackage;

import android.content.Context;
import android.net.Uri;
import android.text.TextUtils;
import java.io.File;
import java.io.IOException;
import java.io.InputStream;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class uej extends uhq {
    private final Context a;
    private final uhp b;
    private final uhp c;
    private final Object d = new Object();
    private String e;
    private final uey f;

    public uej(uei ueiVar) {
        this.b = new ufc(ueiVar.c);
        this.a = ueiVar.a;
        this.c = ueiVar.b;
        this.f = ueiVar.d;
    }

    private final void r() throws ufg {
        if (this.c == null) {
            throw new ufg("Android backend cannot perform remote operations without a remote backend");
        }
    }

    private final boolean s(Uri uri) {
        return (TextUtils.isEmpty(uri.getAuthority()) || this.a.getPackageName().equals(uri.getAuthority())) ? false : true;
    }

    @Override // defpackage.uhq, defpackage.uhp
    public final File c(Uri uri) throws IOException {
        String str;
        if (s(uri)) {
            throw new IOException("operation is not permitted in other authorities.");
        }
        Context context = this.a;
        File fileA = new uen(context, this.f).a(uri);
        if (!mhv.h(context)) {
            synchronized (this.d) {
                if (this.e == null) {
                    this.e = uek.a(context).getAbsolutePath();
                }
                str = this.e;
            }
            if (!fileA.getAbsolutePath().startsWith(str)) {
                throw new ufg("Cannot access credential-protected data from direct boot");
            }
        }
        return fileA;
    }

    @Override // defpackage.uhq, defpackage.uhp
    public final InputStream d(Uri uri) throws ufg {
        if (!s(uri)) {
            return this.b.d(p(uri));
        }
        r();
        return this.c.d(uri);
    }

    @Override // defpackage.uhp
    public final String h() {
        return "android";
    }

    @Override // defpackage.uhq, defpackage.uhp
    public final boolean m(Uri uri) throws ufg {
        if (!s(uri)) {
            return this.b.m(p(uri));
        }
        r();
        return this.c.m(uri);
    }

    @Override // defpackage.uhq
    protected final Uri o(Uri uri) throws ufu {
        try {
            Context context = this.a;
            int i = uem.b;
            uel uelVar = new uel(context);
            uelVar.c(uri.getPath(), this.f);
            return uelVar.a();
        } catch (IllegalArgumentException e) {
            throw new ufu(e);
        }
    }

    @Override // defpackage.uhq
    protected final Uri p(Uri uri) throws ufu {
        if (s(uri)) {
            throw new ufu("Operation across authorities is not allowed.");
        }
        File fileC = c(uri);
        Uri.Builder builderPath = new Uri.Builder().scheme("file").authority("").path("/");
        int i = yyk.e;
        yyf yyfVar = new yyf(4);
        builderPath.path(fileC.getAbsolutePath());
        return uez.a(builderPath, yyfVar);
    }

    @Override // defpackage.uhq
    protected final uhp q() {
        return this.b;
    }
}

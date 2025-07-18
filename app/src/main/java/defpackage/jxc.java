package defpackage;

import android.net.Network;
import com.google.android.gms.auth.aang.GetTokenRequest;
import com.google.android.gms.auth.aang.GoogleAccount;
import java.util.List;

/* compiled from: PG */
/* loaded from: classes.dex */
public class jxc extends jxg {
    public GoogleAccount a;
    public List b;
    public List c;
    public List d;
    public List e;
    public String f;
    public String g;
    public Network h;
    public byte i;
    private int j;
    private boolean k;

    @Override // defpackage.jxg
    public final int a() {
        if ((this.i & 1) != 0) {
            return this.j;
        }
        throw new IllegalStateException("Property \"delegationType\" has not been set");
    }

    @Override // defpackage.jxg
    public final GetTokenRequest b() {
        if (this.i == 7) {
            return new GetTokenRequest(this.a, null, this.b, this.c, this.d, this.e, this.j, this.f, false, null, this.g, this.k, this.h);
        }
        StringBuilder sb = new StringBuilder();
        if ((this.i & 1) == 0) {
            sb.append(" delegationType");
        }
        if ((this.i & 2) == 0) {
            sb.append(" handleNotification");
        }
        if ((this.i & 4) == 0) {
            sb.append(" suppressProgressScreen");
        }
        throw new IllegalStateException("Missing required properties:".concat(sb.toString()));
    }

    @Override // defpackage.jxg
    public final GoogleAccount c() {
        return this.a;
    }

    @Override // defpackage.jxg
    public final String d() {
        return this.f;
    }

    @Override // defpackage.jxg
    public final List e() {
        return this.d;
    }

    @Override // defpackage.jxg
    public final List f() {
        return this.e;
    }

    @Override // defpackage.jxg
    public final List g() {
        return this.b;
    }

    @Override // defpackage.jxg
    public final List h() {
        return this.c;
    }

    @Override // defpackage.jxg
    public final void i(int i) {
        this.j = i;
        this.i = (byte) (this.i | 1);
    }

    @Override // defpackage.jxg
    public final void j(boolean z) {
        this.k = z;
        this.i = (byte) (this.i | 4);
    }
}

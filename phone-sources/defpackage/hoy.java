package defpackage;

import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.util.ArrayList;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class hoy implements hws {
    private final /* synthetic */ int a;

    public hoy(int i) {
        this.a = i;
    }

    public static final hoz b() {
        try {
            return new hoz(MessageDigest.getInstance("SHA-256"));
        } catch (NoSuchAlgorithmException e) {
            throw new RuntimeException(e);
        }
    }

    @Override // defpackage.hws
    public final /* synthetic */ Object a() {
        int i = this.a;
        return i != 0 ? i != 1 ? new ArrayList() : new hnu() : b();
    }
}

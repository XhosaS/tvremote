package defpackage;

import java.nio.ByteBuffer;
import java.nio.charset.Charset;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class snj implements yfo {
    private static final Charset d;
    private static final List e;
    public volatile sni c;
    private final String f;
    public final Object b = new Object();
    public final Map a = new HashMap(10);

    static {
        new snj("");
        d = Charset.forName("UTF-8");
        e = new ArrayList();
    }

    private snj(String str) {
        this.f = str;
    }

    public static long a(String str) throws NoSuchAlgorithmException {
        try {
            MessageDigest messageDigest = MessageDigest.getInstance("MD5");
            messageDigest.update(str.getBytes(d));
            return ByteBuffer.wrap(messageDigest.digest()).getLong();
        } catch (NoSuchAlgorithmException e2) {
            throw new RuntimeException(e2);
        }
    }

    public static synchronized snj d(String str) {
        List<snj> list = e;
        for (snj snjVar : list) {
            if (snjVar.f.equals(str)) {
                return snjVar;
            }
        }
        snj snjVar2 = new snj(str);
        list.add(snjVar2);
        return snjVar2;
    }

    @Override // defpackage.yfo, defpackage.yfn
    public final /* synthetic */ Object b() {
        return this.c;
    }

    public final snc c(String str, sne... sneVarArr) {
        synchronized (this.b) {
            Map map = this.a;
            snc sncVar = (snc) map.get(str);
            if (sncVar != null) {
                sncVar.g(sneVarArr);
                return sncVar;
            }
            snc sncVar2 = new snc(str, this, sneVarArr);
            map.put(sncVar2.b, sncVar2);
            return sncVar2;
        }
    }

    public final snf e(String str, sne... sneVarArr) {
        synchronized (this.b) {
            Map map = this.a;
            snf snfVar = (snf) map.get(str);
            if (snfVar != null) {
                snfVar.g(sneVarArr);
                return snfVar;
            }
            snf snfVar2 = new snf(str, this, sneVarArr);
            map.put(snfVar2.b, snfVar2);
            return snfVar2;
        }
    }
}

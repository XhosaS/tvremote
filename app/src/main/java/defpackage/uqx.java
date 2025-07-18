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
public final class uqx implements agow {
    private static final Charset d;
    private static final List e;
    public volatile uqw c;
    private final String f;
    public final Object b = new Object();
    public final Map a = new HashMap(10);

    static {
        new uqx("");
        d = Charset.forName("UTF-8");
        e = new ArrayList();
    }

    private uqx(String str) {
        this.f = str;
    }

    public static long b(String str) throws NoSuchAlgorithmException {
        try {
            MessageDigest messageDigest = MessageDigest.getInstance("MD5");
            messageDigest.update(str.getBytes(d));
            return ByteBuffer.wrap(messageDigest.digest()).getLong();
        } catch (NoSuchAlgorithmException e2) {
            throw new RuntimeException(e2);
        }
    }

    public static synchronized uqx e(String str) {
        List<uqx> list = e;
        for (uqx uqxVar : list) {
            if (uqxVar.f.equals(str)) {
                return uqxVar;
            }
        }
        uqx uqxVar2 = new uqx(str);
        list.add(uqxVar2);
        return uqxVar2;
    }

    @Override // defpackage.agow
    public final /* synthetic */ Object a() {
        return this.c;
    }

    public final uqo c(String str, uqs... uqsVarArr) {
        synchronized (this.b) {
            Map map = this.a;
            uqo uqoVar = (uqo) map.get(str);
            if (uqoVar != null) {
                uqoVar.e(uqsVarArr);
                return uqoVar;
            }
            uqo uqoVar2 = new uqo(str, this, uqsVarArr);
            map.put(uqoVar2.b, uqoVar2);
            return uqoVar2;
        }
    }

    public final uqq d(String str, uqs... uqsVarArr) {
        synchronized (this.b) {
            Map map = this.a;
            uqq uqqVar = (uqq) map.get(str);
            if (uqqVar != null) {
                uqqVar.e(uqsVarArr);
                return uqqVar;
            }
            uqq uqqVar2 = new uqq(str, this, uqsVarArr);
            map.put(uqqVar2.b, uqqVar2);
            return uqqVar2;
        }
    }
}

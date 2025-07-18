package defpackage;

import java.util.HashSet;
import java.util.Hashtable;
import java.util.Set;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class zye {
    public static final Hashtable a;
    public static final Hashtable b;
    public static final Set c;

    static {
        Hashtable hashtable = new Hashtable();
        a = hashtable;
        Hashtable hashtable2 = new Hashtable();
        b = hashtable2;
        HashSet hashSet = new HashSet();
        c = hashSet;
        hashtable.put("MD2WITHRSAENCRYPTION", zlp.b);
        hashtable.put("MD2WITHRSA", zlp.b);
        hashtable.put("MD5WITHRSAENCRYPTION", zlp.c);
        hashtable.put("MD5WITHRSA", zlp.c);
        hashtable.put("SHA1WITHRSAENCRYPTION", zlp.d);
        hashtable.put("SHA1WITHRSA", zlp.d);
        hashtable.put("SHA224WITHRSAENCRYPTION", zlp.j);
        hashtable.put("SHA224WITHRSA", zlp.j);
        hashtable.put("SHA256WITHRSAENCRYPTION", zlp.g);
        hashtable.put("SHA256WITHRSA", zlp.g);
        hashtable.put("SHA384WITHRSAENCRYPTION", zlp.h);
        hashtable.put("SHA384WITHRSA", zlp.h);
        hashtable.put("SHA512WITHRSAENCRYPTION", zlp.i);
        hashtable.put("SHA512WITHRSA", zlp.i);
        hashtable.put("SHA1WITHRSAANDMGF1", zlp.f);
        hashtable.put("SHA224WITHRSAANDMGF1", zlp.f);
        hashtable.put("SHA256WITHRSAANDMGF1", zlp.f);
        hashtable.put("SHA384WITHRSAANDMGF1", zlp.f);
        hashtable.put("SHA512WITHRSAANDMGF1", zlp.f);
        hashtable.put("RIPEMD160WITHRSAENCRYPTION", zlt.f);
        hashtable.put("RIPEMD160WITHRSA", zlt.f);
        hashtable.put("RIPEMD128WITHRSAENCRYPTION", zlt.g);
        hashtable.put("RIPEMD128WITHRSA", zlt.g);
        hashtable.put("RIPEMD256WITHRSAENCRYPTION", zlt.h);
        hashtable.put("RIPEMD256WITHRSA", zlt.h);
        hashtable.put("SHA1WITHDSA", zni.o);
        hashtable.put("DSAWITHSHA1", zni.o);
        hashtable.put("SHA224WITHDSA", zln.r);
        hashtable.put("SHA256WITHDSA", zln.s);
        hashtable.put("SHA384WITHDSA", zln.t);
        hashtable.put("SHA512WITHDSA", zln.u);
        hashtable.put("SHA1WITHECDSA", zni.e);
        hashtable.put("ECDSAWITHSHA1", zni.e);
        hashtable.put("SHA224WITHECDSA", zni.h);
        hashtable.put("SHA256WITHECDSA", zni.i);
        hashtable.put("SHA384WITHECDSA", zni.j);
        hashtable.put("SHA512WITHECDSA", zni.k);
        hashtable.put("GOST3411WITHGOST3410", zll.c);
        hashtable.put("GOST3411WITHGOST3410-94", zll.c);
        hashtable.put("GOST3411WITHECGOST3410", zll.d);
        hashtable.put("GOST3411WITHECGOST3410-2001", zll.d);
        hashtable.put("GOST3411WITHGOST3410-2001", zll.d);
        hashSet.add(zni.e);
        hashSet.add(zni.h);
        hashSet.add(zni.i);
        hashSet.add(zni.j);
        hashSet.add(zni.k);
        hashSet.add(zni.o);
        hashSet.add(zoq.b);
        hashSet.add(zln.r);
        hashSet.add(zln.s);
        hashSet.add(zln.t);
        hashSet.add(zln.u);
        hashSet.add(zll.c);
        hashSet.add(zll.d);
        hashtable2.put("SHA1WITHRSAANDMGF1", a(new zmd(zoq.a, zkm.a), 20));
        hashtable2.put("SHA224WITHRSAANDMGF1", a(new zmd(zln.f, zkm.a), 28));
        hashtable2.put("SHA256WITHRSAANDMGF1", a(new zmd(zln.c, zkm.a), 32));
        hashtable2.put("SHA384WITHRSAANDMGF1", a(new zmd(zln.d, zkm.a), 48));
        hashtable2.put("SHA512WITHRSAANDMGF1", a(new zmd(zln.e, zkm.a), 64));
    }

    private static zlr a(zmd zmdVar, int i) {
        return new zlr(zmdVar, new zmd(zlp.e, zmdVar), new ziu(i), new ziu(1L));
    }
}

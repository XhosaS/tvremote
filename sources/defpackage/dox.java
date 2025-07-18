package defpackage;

import java.util.HashSet;
import java.util.Hashtable;
import java.util.Set;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class dox {
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
        hashtable.put("MD2WITHRSAENCRYPTION", dci.b);
        hashtable.put("MD2WITHRSA", dci.b);
        hashtable.put("MD5WITHRSAENCRYPTION", dci.c);
        hashtable.put("MD5WITHRSA", dci.c);
        hashtable.put("SHA1WITHRSAENCRYPTION", dci.d);
        hashtable.put("SHA1WITHRSA", dci.d);
        hashtable.put("SHA224WITHRSAENCRYPTION", dci.j);
        hashtable.put("SHA224WITHRSA", dci.j);
        hashtable.put("SHA256WITHRSAENCRYPTION", dci.g);
        hashtable.put("SHA256WITHRSA", dci.g);
        hashtable.put("SHA384WITHRSAENCRYPTION", dci.h);
        hashtable.put("SHA384WITHRSA", dci.h);
        hashtable.put("SHA512WITHRSAENCRYPTION", dci.i);
        hashtable.put("SHA512WITHRSA", dci.i);
        hashtable.put("SHA1WITHRSAANDMGF1", dci.f);
        hashtable.put("SHA224WITHRSAANDMGF1", dci.f);
        hashtable.put("SHA256WITHRSAANDMGF1", dci.f);
        hashtable.put("SHA384WITHRSAANDMGF1", dci.f);
        hashtable.put("SHA512WITHRSAANDMGF1", dci.f);
        hashtable.put("RIPEMD160WITHRSAENCRYPTION", dcm.f);
        hashtable.put("RIPEMD160WITHRSA", dcm.f);
        hashtable.put("RIPEMD128WITHRSAENCRYPTION", dcm.g);
        hashtable.put("RIPEMD128WITHRSA", dcm.g);
        hashtable.put("RIPEMD256WITHRSAENCRYPTION", dcm.h);
        hashtable.put("RIPEMD256WITHRSA", dcm.h);
        hashtable.put("SHA1WITHDSA", deb.o);
        hashtable.put("DSAWITHSHA1", deb.o);
        hashtable.put("SHA224WITHDSA", dcg.r);
        hashtable.put("SHA256WITHDSA", dcg.s);
        hashtable.put("SHA384WITHDSA", dcg.t);
        hashtable.put("SHA512WITHDSA", dcg.u);
        hashtable.put("SHA1WITHECDSA", deb.e);
        hashtable.put("ECDSAWITHSHA1", deb.e);
        hashtable.put("SHA224WITHECDSA", deb.h);
        hashtable.put("SHA256WITHECDSA", deb.i);
        hashtable.put("SHA384WITHECDSA", deb.j);
        hashtable.put("SHA512WITHECDSA", deb.k);
        hashtable.put("GOST3411WITHGOST3410", dce.c);
        hashtable.put("GOST3411WITHGOST3410-94", dce.c);
        hashtable.put("GOST3411WITHECGOST3410", dce.d);
        hashtable.put("GOST3411WITHECGOST3410-2001", dce.d);
        hashtable.put("GOST3411WITHGOST3410-2001", dce.d);
        hashSet.add(deb.e);
        hashSet.add(deb.h);
        hashSet.add(deb.i);
        hashSet.add(deb.j);
        hashSet.add(deb.k);
        hashSet.add(deb.o);
        hashSet.add(dfh.b);
        hashSet.add(dcg.r);
        hashSet.add(dcg.s);
        hashSet.add(dcg.t);
        hashSet.add(dcg.u);
        hashSet.add(dce.c);
        hashSet.add(dce.d);
        hashtable2.put("SHA1WITHRSAANDMGF1", a(new dcw(dfh.a, dbg.a), 20));
        hashtable2.put("SHA224WITHRSAANDMGF1", a(new dcw(dcg.f, dbg.a), 28));
        hashtable2.put("SHA256WITHRSAANDMGF1", a(new dcw(dcg.c, dbg.a), 32));
        hashtable2.put("SHA384WITHRSAANDMGF1", a(new dcw(dcg.d, dbg.a), 48));
        hashtable2.put("SHA512WITHRSAANDMGF1", a(new dcw(dcg.e, dbg.a), 64));
    }

    private static dck a(dcw dcwVar, int i) {
        return new dck(dcwVar, new dcw(dci.e, dcwVar), new czo(i), new czo(1L));
    }
}

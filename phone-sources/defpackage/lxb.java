package defpackage;

import android.text.TextUtils;
import android.util.Base64;
import java.io.IOException;
import java.security.InvalidAlgorithmParameterException;
import java.security.InvalidKeyException;
import java.security.NoSuchAlgorithmException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.Objects;
import java.util.Set;
import javax.crypto.BadPaddingException;
import javax.crypto.Cipher;
import javax.crypto.IllegalBlockSizeException;
import javax.crypto.NoSuchPaddingException;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.SecretKeySpec;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class lxb {
    public final vsz a;
    public tpg d;
    public float e;
    public boolean f;
    public IOException g;
    public Set i;
    private final int k;
    private final String l;
    private final String m;
    private final Locale n;
    public List h = Collections.EMPTY_LIST;
    public final List b = new ArrayList();
    public final List c = new ArrayList();
    private final List j = new ArrayList();

    public lxb(byte[] bArr, int i, String str, String str2, Locale locale) {
        this.a = vsz.q(bArr);
        this.k = i;
        this.l = str;
        this.m = str2;
        this.n = locale;
    }

    public static byte[] b(byte[] bArr, String str, String str2) throws NoSuchPaddingException, NoSuchAlgorithmException, InvalidKeyException, mfh, InvalidAlgorithmParameterException {
        try {
            SecretKeySpec secretKeySpec = new SecretKeySpec(h(Base64.decode(str, 8)), "AES");
            IvParameterSpec ivParameterSpec = new IvParameterSpec(str2 == null ? new byte[16] : h(str2.getBytes()));
            try {
                Cipher cipher = Cipher.getInstance("AES/CBC/PKCS5Padding");
                try {
                    cipher.init(2, secretKeySpec, ivParameterSpec);
                    try {
                        return cipher.doFinal(bArr);
                    } catch (RuntimeException | BadPaddingException | IllegalBlockSizeException e) {
                        throw new mfh(e);
                    }
                } catch (InvalidAlgorithmParameterException | InvalidKeyException e2) {
                    throw new mfh(e2);
                }
            } catch (NoSuchAlgorithmException | NoSuchPaddingException e3) {
                throw new mfh(e3);
            }
        } catch (IllegalArgumentException unused) {
            throw new mfh("Cannot base64-decode video ID ".concat(str));
        }
    }

    private static final void g(tpa tpaVar, String str) throws vuq {
        if (tpaVar.b.isEmpty()) {
            throw new vuq(a.cg(str, "Image of '", "' invalid - no url"));
        }
    }

    private static byte[] h(byte[] bArr) {
        int length = bArr.length;
        if (length == 16) {
            return bArr;
        }
        byte[] bArr2 = new byte[16];
        System.arraycopy(bArr, 0, bArr2, 0, Math.min(length, 16));
        return bArr2;
    }

    public final int a(int i) {
        return (int) ((i / this.e) * 1000.0f);
    }

    public final int[] c(vsz vszVar) {
        if (vszVar.v()) {
            return null;
        }
        try {
            vtp vtpVarA = vtp.a();
            tox toxVar = tox.a;
            vte vteVarK = vszVar.k();
            vuc vucVarO = toxVar.o();
            try {
                try {
                    vvy vvyVarB = vvs.a.b(vucVarO);
                    vvyVarB.l(vucVarO, vtf.p(vteVarK), vtpVarA);
                    vvyVarB.g(vucVarO);
                    try {
                        vteVarK.z(0);
                        vuc.B(vucVarO);
                        tox toxVar2 = (tox) vucVarO;
                        int size = toxVar2.b.size();
                        if (size == 0) {
                            return null;
                        }
                        int[] iArr = new int[size];
                        int i = 0;
                        for (int i2 = 0; i2 < size; i2++) {
                            int iE = toxVar2.b.e(i2);
                            if (iE < 0) {
                                return null;
                            }
                            i += iE;
                            iArr[i2] = a(i);
                        }
                        return iArr;
                    } catch (vuq e) {
                        throw e;
                    }
                } catch (IOException e2) {
                    if (e2.getCause() instanceof vuq) {
                        throw ((vuq) e2.getCause());
                    }
                    throw new vuq(e2);
                } catch (RuntimeException e3) {
                    if (e3.getCause() instanceof vuq) {
                        throw ((vuq) e3.getCause());
                    }
                    throw e3;
                }
            } catch (vuq e4) {
                if (e4.a) {
                    throw new vuq(e4);
                }
                throw e4;
            } catch (vwf e5) {
                throw e5.a();
            }
        } catch (vuq unused) {
            return null;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void d() throws IOException {
        kth kthVar;
        if (this.f) {
            IOException iOException = this.g;
            if (iOException != null) {
                throw iOException;
            }
            return;
        }
        try {
            try {
                vte vteVarK = this.a.k();
                vteVarK.H();
                vsz vszVarW = vteVarK.w();
                vtp vtpVarA = vtp.a();
                tpg tpgVar = tpg.a;
                vte vteVarK2 = vszVarW.k();
                vuc vucVarO = tpgVar.o();
                try {
                    vvy vvyVarB = vvs.a.b(vucVarO);
                    vvyVarB.l(vucVarO, vtf.p(vteVarK2), vtpVarA);
                    vvyVarB.g(vucVarO);
                    int i = 0;
                    try {
                        vteVarK2.z(0);
                        vuc.B(vucVarO);
                        tpg tpgVar2 = (tpg) vucVarO;
                        this.d = tpgVar2;
                        float f = tpgVar2.c;
                        if (f <= 0.0f) {
                            throw new vuq("Header invalid - no FPS");
                        }
                        this.e = f;
                        if ((tpgVar2.b & 2) == 0) {
                            throw new vuq("Header invalid - no film");
                        }
                        toz tozVar = tpgVar2.d;
                        if (tozVar == null) {
                            tozVar = toz.a;
                        }
                        HashSet hashSet = new HashSet();
                        HashSet hashSet2 = new HashSet();
                        vun<tpb> vunVar = tozVar.f;
                        int size = tozVar.h.size();
                        HashSet hashSet3 = new HashSet();
                        for (tpb tpbVar : vunVar) {
                            int i2 = tpbVar.j;
                            if (!hashSet.add(Integer.valueOf(i2))) {
                                throw new vuq(a.cf(i2, "Actor invalid - duplicate local ID "));
                            }
                            int size2 = tpbVar.k.size();
                            if (size2 == 0) {
                                throw new vuq(a.cf(i2, "Actor invalid - no split IDs for LID "));
                            }
                            for (int i3 = 0; i3 < size2; i3++) {
                                Integer numValueOf = Integer.valueOf(tpbVar.k.e(i3));
                                if (!hashSet2.add(numValueOf)) {
                                    Objects.toString(numValueOf);
                                    throw new vuq("Actor invalid - duplicate split ID ".concat(numValueOf.toString()));
                                }
                            }
                            if (tpbVar.d.isEmpty()) {
                                throw new vuq(a.cf(i2, "Actor invalid - no name for LID "));
                            }
                            if ((tpbVar.b & 16) != 0) {
                                tpa tpaVar = tpbVar.e;
                                if (tpaVar == null) {
                                    tpaVar = tpa.a;
                                }
                                g(tpaVar, tpbVar.d);
                            }
                            for (Integer num : tpbVar.l) {
                                int iIntValue = num.intValue();
                                if (iIntValue >= 0 && iIntValue < size) {
                                    hashSet3.add(num);
                                }
                            }
                        }
                        for (tpd tpdVar : tozVar.g) {
                            int i4 = tpdVar.f;
                            Integer numValueOf2 = Integer.valueOf(i4);
                            if (!hashSet.add(numValueOf2)) {
                                throw new vuq(a.cf(i4, "Song invalid - duplicate local ID "));
                            }
                            if (!hashSet2.add(numValueOf2)) {
                                throw new vuq(a.cf(i4, "Song invalid - duplicate split ID "));
                            }
                            if (tpdVar.c.isEmpty()) {
                                throw new vuq(a.cf(i4, "Song invalid - no title for LID "));
                            }
                            if ((tpdVar.b & 64) != 0) {
                                tpa tpaVar2 = tpdVar.g;
                                if (tpaVar2 == null) {
                                    tpaVar2 = tpa.a;
                                }
                                g(tpaVar2, tpdVar.c);
                            }
                        }
                        this.i = hashSet3;
                        int iD = this.a.d();
                        int size3 = this.d.e.size();
                        if (size3 == 0) {
                            throw new vuq("Header invalid - no chunks defined");
                        }
                        int i5 = Integer.MIN_VALUE;
                        int i6 = Integer.MIN_VALUE;
                        while (i < size3) {
                            tpe tpeVar = (tpe) this.d.e.get(i);
                            int i7 = tpeVar.b;
                            if (i7 < 0) {
                                throw new vuq(a.cd(i, "Header invalid - chunk[", "]'s start invalid"));
                            }
                            if (i7 <= i5) {
                                throw new vuq(a.cd(i, "Header invalid - chunk[", "]'s start not increasing"));
                            }
                            int i8 = tpeVar.c;
                            if (i8 <= 0) {
                                throw new vuq(a.cd(i, "Header invalid - chunk[", "]'s byte offset invalid"));
                            }
                            if (i8 <= i6) {
                                throw new vuq(a.cd(i, "Header invalid - chunk[", "]'s byte offset not increasing"));
                            }
                            if (i8 >= iD) {
                                throw new vuq(a.cd(i, "Header invalid - chunk[", "]'s byte offset beyond file size"));
                            }
                            i++;
                            i6 = i8;
                            i5 = i7;
                        }
                        vun vunVar2 = tozVar.h;
                        Set set = this.i;
                        ArrayList arrayList = new ArrayList(set.size());
                        Iterator it = set.iterator();
                        while (it.hasNext()) {
                            toz tozVar2 = (toz) vunVar2.get(((Integer) it.next()).intValue());
                            if (tozVar2.c.isEmpty()) {
                                throw new vuq("Referenced film invalid - no title");
                            }
                            if (!tozVar2.b.isEmpty()) {
                                String str = tozVar2.b;
                                if (tozVar2.i) {
                                    krf.c(str);
                                    kthVar = new kth(18, str, ktc.l(str));
                                } else {
                                    krf.c(str);
                                    kthVar = new kth(6, str, ktc.l(str));
                                }
                                arrayList.add(kthVar);
                            }
                        }
                        this.h = krh.h(arrayList);
                    } catch (vuq e) {
                        throw e;
                    }
                } catch (vwf e2) {
                    throw e2.a();
                } catch (RuntimeException e3) {
                    if (!(e3.getCause() instanceof vuq)) {
                        throw e3;
                    }
                    throw ((vuq) e3.getCause());
                } catch (vuq e4) {
                    if (!e4.a) {
                        throw e4;
                    }
                    throw new vuq(e4);
                } catch (IOException e5) {
                    if (!(e5.getCause() instanceof vuq)) {
                        throw new vuq(e5);
                    }
                    throw ((vuq) e5.getCause());
                }
            } catch (IOException e6) {
                this.g = e6;
                throw e6;
            }
        } finally {
            this.f = true;
        }
    }

    public final tju e(tpa tpaVar, String str, Map map) {
        String strConcat = tpaVar.b;
        if (strConcat.startsWith("http:")) {
            strConcat = "https:".concat(String.valueOf(strConcat.substring(5)));
        }
        String str2 = strConcat;
        if (map.containsKey(str2)) {
            return (tju) map.get(str2);
        }
        List list = this.j;
        list.clear();
        for (tpc tpcVar : tpaVar.c) {
            list.add(new int[]{tpcVar.b, tpcVar.d, tpcVar.c, tpcVar.e});
        }
        tju tjuVar = new tju(str, str2, list, this.k, this.m, this.n, this.l);
        list.clear();
        map.put(str2, tjuVar);
        return tjuVar;
    }

    public final tju f(xax xaxVar, int i, int i2, float f, String str, Map map) {
        xao xaoVarQ;
        String strN;
        if (xaxVar == null || (xaxVar.b & 16) == 0) {
            xaoVarQ = null;
            strN = null;
        } else {
            float f2 = i2 / f;
            xar xarVar = xaxVar.g;
            if (xarVar == null) {
                xarVar = xar.a;
            }
            int i3 = (int) f2;
            xaoVarQ = ktc.q(xarVar.h, i, i2, i3, 0.0f);
            strN = ktc.n(xaoVarQ, i2, i3);
        }
        if (TextUtils.isEmpty(strN)) {
            return null;
        }
        if (map.containsKey(strN)) {
            return (tju) map.get(strN);
        }
        int i4 = xaoVarQ.d;
        int i5 = xaoVarQ.e;
        tju tjuVar = new tju(str, strN, this.j, this.k, this.m, this.n, this.l);
        map.put(strN, tjuVar);
        return tjuVar;
    }
}

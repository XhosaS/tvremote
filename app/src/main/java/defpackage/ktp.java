package defpackage;

import j$.util.DesugarCollections;
import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.regex.PatternSyntaxException;

/* compiled from: PG */
/* loaded from: classes.dex */
abstract class ktp {
    final String c;
    final int d;
    Boolean e;
    Boolean f;
    Long g;
    Long h;

    public ktp(String str, int i) {
        this.c = str;
        this.d = i;
    }

    static Boolean d(BigDecimal bigDecimal, liy liyVar, double d) {
        int i;
        int iA;
        BigDecimal bigDecimal2;
        BigDecimal bigDecimal3;
        BigDecimal bigDecimal4;
        kkk.k(liyVar);
        int i2 = liyVar.b;
        if ((i2 & 1) != 0 && (iA = lix.a((i = liyVar.c))) != 0) {
            if (iA != 1) {
                int iA2 = lix.a(i);
                if (iA2 != 0 && iA2 == 5) {
                    if ((i2 & 8) == 0 || (i2 & 16) == 0) {
                        return null;
                    }
                } else if ((i2 & 4) != 0) {
                }
                int iA3 = lix.a(i);
                if (iA3 == 0) {
                    iA3 = 1;
                }
                int iA4 = lix.a(i);
                if (iA4 != 0 && iA4 == 5) {
                    if (lik.H(liyVar.f) && lik.H(liyVar.g)) {
                        try {
                            BigDecimal bigDecimal5 = new BigDecimal(liyVar.f);
                            bigDecimal4 = new BigDecimal(liyVar.g);
                            bigDecimal3 = bigDecimal5;
                            bigDecimal2 = null;
                        } catch (NumberFormatException unused) {
                        }
                    }
                    return null;
                }
                if (!lik.H(liyVar.e)) {
                    return null;
                }
                try {
                    bigDecimal2 = new BigDecimal(liyVar.e);
                    bigDecimal3 = null;
                    bigDecimal4 = null;
                } catch (NumberFormatException unused2) {
                }
                if (iA3 == 5) {
                    if (bigDecimal3 == null) {
                        return null;
                    }
                } else if (bigDecimal2 == null) {
                    return null;
                }
                int i3 = iA3 - 1;
                if (i3 == 1) {
                    if (bigDecimal2 == null) {
                        return null;
                    }
                    return Boolean.valueOf(bigDecimal.compareTo(bigDecimal2) < 0);
                }
                if (i3 == 2) {
                    if (bigDecimal2 == null) {
                        return null;
                    }
                    return Boolean.valueOf(bigDecimal.compareTo(bigDecimal2) > 0);
                }
                if (i3 != 3) {
                    if (i3 == 4 && bigDecimal3 != null) {
                        return Boolean.valueOf(bigDecimal.compareTo(bigDecimal3) >= 0 && bigDecimal.compareTo(bigDecimal4) <= 0);
                    }
                    return null;
                }
                if (bigDecimal2 == null) {
                    return null;
                }
                if (d != 0.0d) {
                    return Boolean.valueOf(bigDecimal.compareTo(bigDecimal2.subtract(new BigDecimal(d).multiply(new BigDecimal(2)))) > 0 && bigDecimal.compareTo(bigDecimal2.add(new BigDecimal(d).multiply(new BigDecimal(2)))) < 0);
                }
                return Boolean.valueOf(bigDecimal.compareTo(bigDecimal2) == 0);
            }
        }
        return null;
    }

    static Boolean e(String str, lje ljeVar, lab labVar) {
        int i;
        int iA;
        int iA2;
        List list;
        kkk.k(ljeVar);
        if (str != null) {
            int i2 = ljeVar.b;
            if ((i2 & 1) != 0 && (iA = ljd.a((i = ljeVar.c))) != 0 && iA != 1 && ((iA2 = ljd.a(i)) != 0 && iA2 == 7 ? ljeVar.f.size() != 0 : (i2 & 2) != 0)) {
                int iA3 = ljd.a(ljeVar.c);
                int i3 = iA3 == 0 ? 1 : iA3;
                boolean z = ljeVar.e;
                String upperCase = (z || i3 == 2 || i3 == 7) ? ljeVar.d : ljeVar.d.toUpperCase(Locale.ENGLISH);
                if (ljeVar.f.size() == 0) {
                    list = null;
                } else {
                    List listUnmodifiableList = ljeVar.f;
                    if (!z) {
                        ArrayList arrayList = new ArrayList(listUnmodifiableList.size());
                        Iterator it = listUnmodifiableList.iterator();
                        while (it.hasNext()) {
                            arrayList.add(((String) it.next()).toUpperCase(Locale.ENGLISH));
                        }
                        listUnmodifiableList = DesugarCollections.unmodifiableList(arrayList);
                    }
                    list = listUnmodifiableList;
                }
                return j(str, i3, z, upperCase, list, i3 == 2 ? upperCase : null, labVar);
            }
        }
        return null;
    }

    static Boolean f(double d, liy liyVar) {
        try {
            return d(new BigDecimal(d), liyVar, Math.ulp(d));
        } catch (NumberFormatException unused) {
            return null;
        }
    }

    static Boolean g(long j, liy liyVar) {
        try {
            return d(new BigDecimal(j), liyVar, 0.0d);
        } catch (NumberFormatException unused) {
            return null;
        }
    }

    static Boolean h(String str, liy liyVar) {
        if (!lik.H(str)) {
            return null;
        }
        try {
            return d(new BigDecimal(str), liyVar, 0.0d);
        } catch (NumberFormatException unused) {
            return null;
        }
    }

    static Boolean i(Boolean bool, boolean z) {
        if (bool == null) {
            return null;
        }
        return Boolean.valueOf(bool.booleanValue() != z);
    }

    private static Boolean j(String str, int i, boolean z, String str2, List list, String str3, lab labVar) {
        if (i == 7) {
            if (list == null || list.isEmpty()) {
                return null;
            }
        } else if (str2 == null) {
            return null;
        }
        if (!z && i != 2) {
            str = str.toUpperCase(Locale.ENGLISH);
        }
        switch (i - 1) {
            case 1:
                if (str3 != null) {
                    try {
                        break;
                    } catch (PatternSyntaxException unused) {
                        if (labVar != null) {
                            labVar.f.b("Invalid regular expression in REGEXP audience filter. expression", str3);
                        }
                        return null;
                    }
                }
                break;
            case 6:
                if (list != null) {
                    break;
                }
                break;
        }
        return null;
    }

    public abstract int a();

    public abstract boolean b();

    public abstract boolean c();
}

package defpackage;

import java.util.BitSet;

/* compiled from: PG */
/* loaded from: classes.dex */
public abstract class tsa implements tsv {
    protected tsa() {
    }

    public static tsa j(CharSequence charSequence) {
        int length = charSequence.length();
        return length != 0 ? length != 1 ? length != 2 ? new trn(charSequence) : new trt(charSequence.charAt(0), charSequence.charAt(1)) : new trs(charSequence.charAt(0)) : trx.a;
    }

    public static String l(char c) {
        char[] cArr = new char[6];
        int i = 0;
        cArr[0] = '\\';
        cArr[1] = 'u';
        cArr[2] = 0;
        cArr[3] = 0;
        cArr[4] = 0;
        cArr[5] = 0;
        int i2 = c;
        while (i < 4) {
            cArr[5 - i] = "0123456789ABCDEF".charAt(i2 & 15);
            i++;
            i2 >>= 4;
        }
        return String.copyValueOf(cArr);
    }

    private static tsa m(int i, BitSet bitSet, String str) {
        int i2;
        if (i == 0) {
            return trx.a;
        }
        if (i == 1) {
            return new trs((char) bitSet.nextSetBit(0));
        }
        int i3 = 2;
        if (i == 2) {
            char cNextSetBit = (char) bitSet.nextSetBit(0);
            return new trt(cNextSetBit, (char) bitSet.nextSetBit(cNextSetBit + 1));
        }
        int length = bitSet.length();
        if (i > 1023 || length <= i * 64) {
            return new trp(bitSet, str);
        }
        int iCardinality = bitSet.cardinality();
        boolean z = bitSet.get(0);
        if (iCardinality != 1) {
            int iHighestOneBit = Integer.highestOneBit(iCardinality - 1);
            i3 = iHighestOneBit + iHighestOneBit;
            while (i3 * 0.5d < iCardinality) {
                i3 += i3;
            }
        }
        char[] cArr = new char[i3];
        int i4 = i3 - 1;
        int iNextSetBit = bitSet.nextSetBit(0);
        long j = 0;
        while (iNextSetBit != -1) {
            long j2 = (1 << iNextSetBit) | j;
            int iM = tte.m(iNextSetBit);
            while (true) {
                i2 = iM & i4;
                if (cArr[i2] == 0) {
                    break;
                }
                iM = i2 + 1;
            }
            cArr[i2] = (char) iNextSetBit;
            iNextSetBit = bitSet.nextSetBit(iNextSetBit + 1);
            j = j2;
        }
        return new tte(cArr, j, z, str);
    }

    public void a(BitSet bitSet) {
        for (int i = 65535; i >= 0; i--) {
            if (b((char) i)) {
                bitSet.set(i);
            }
        }
    }

    @Override // defpackage.tsv
    @Deprecated
    public final /* bridge */ /* synthetic */ boolean apply(Object obj) {
        return b(((Character) obj).charValue());
    }

    public abstract boolean b(char c);

    public tsa c() {
        return k();
    }

    public tsa d(tsa tsaVar) {
        return new Ctry(this, tsaVar);
    }

    public boolean e(CharSequence charSequence) {
        int length = charSequence.length();
        do {
            length--;
            if (length < 0) {
                return true;
            }
        } while (b(charSequence.charAt(length)));
        return false;
    }

    public boolean f(CharSequence charSequence) {
        return g(charSequence) == -1;
    }

    public int g(CharSequence charSequence) {
        return h(charSequence, 0);
    }

    public int h(CharSequence charSequence, int i) {
        int length = charSequence.length();
        sij.C(i, length);
        while (i < length) {
            if (b(charSequence.charAt(i))) {
                return i;
            }
            i++;
        }
        return -1;
    }

    public final int i(CharSequence charSequence) {
        int i = 0;
        for (int i2 = 0; i2 < charSequence.length(); i2++) {
            if (b(charSequence.charAt(i2))) {
                i++;
            }
        }
        return i;
    }

    public final tsa k() {
        BitSet bitSet = new BitSet();
        a(bitSet);
        int iCardinality = bitSet.cardinality();
        if (iCardinality + iCardinality <= 65536) {
            return m(iCardinality, bitSet, toString());
        }
        bitSet.flip(0, 65536);
        int i = 65536 - iCardinality;
        String string = toString();
        return new trm(m(i, bitSet, string.endsWith(".negate()") ? string.substring(0, string.length() - 9) : String.valueOf(string).concat(".negate()")), string);
    }
}

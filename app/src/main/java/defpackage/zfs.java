package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public enum zfs implements zfr {
    DEFAULT,
    NO_OP,
    SIMPLE_CLASSNAME;

    @Override // defpackage.zfr
    public final /* synthetic */ boolean a(zei zeiVar, StringBuilder sb) {
        int i;
        int iOrdinal = ordinal();
        if (iOrdinal == 0) {
            if (zeiVar == zei.a) {
                return false;
            }
            sb.append(zeiVar.b());
            sb.append('.');
            sb.append(zeiVar.e());
            sb.append(':');
            sb.append(zeiVar.a());
            return true;
        }
        if (iOrdinal == 1) {
            return false;
        }
        if (iOrdinal != 2) {
            throw null;
        }
        if (zeiVar == zei.a) {
            return false;
        }
        String strB = zeiVar.b();
        int iLastIndexOf = strB.lastIndexOf(46);
        if (iLastIndexOf == -1 || (i = iLastIndexOf + 1) >= strB.length()) {
            sb.append(strB);
        } else {
            sb.append((CharSequence) strB, i, strB.length());
        }
        sb.append('.');
        sb.append(zeiVar.e());
        sb.append(':');
        sb.append(zeiVar.a());
        return true;
    }
}

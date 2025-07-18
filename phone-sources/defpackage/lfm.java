package defpackage;

import android.support.v7.widget.ActivityChooserView;
import android.text.TextUtils;
import j$.util.Objects;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class lfm implements lfk {
    private final int a;
    private final lfk b;
    private final ieh c;
    private final Map d = new HashMap();
    private Object e;

    static {
        uof.g(',').f().i();
    }

    public lfm(int i, lfk lfkVar, ieh iehVar) {
        this.a = i;
        this.b = lfkVar;
        this.c = iehVar;
    }

    private final synchronized lfw f(String str) {
        String strD;
        Object objA = this.c.a();
        if (!Objects.equals(this.e, objA)) {
            this.d.clear();
            this.e = objA;
        }
        if (this.d.containsKey(str)) {
            return (lfw) this.d.get(str);
        }
        lfw lfwVar = null;
        try {
            strD = opc.d(((lfl) this.b).a, "videos:".concat(str), null);
        } catch (IllegalArgumentException e) {
            krd.d("Failed to parse ScopedValueExpression", e);
        }
        if (strD == null) {
            return null;
        }
        List<String> listD = lfw.b.d(strD);
        ArrayList arrayList = new ArrayList(listD.size());
        for (String str2 : listD) {
            if (str2.indexOf(58) < 0) {
                arrayList.add(new gb(Integer.MIN_VALUE, ActivityChooserView.ActivityChooserViewAdapter.MAX_ACTIVITY_COUNT_UNLIMITED, str2, (byte[]) null));
            } else {
                Matcher matcher = lfw.a.matcher(str2);
                if (!matcher.matches()) {
                    throw new IllegalArgumentException("Malformed scoped value expression: ".concat(strD));
                }
                int i = Integer.parseInt(matcher.group(1));
                String strGroup = matcher.group(2);
                String strGroup2 = matcher.group(3);
                if (sij.F(strGroup)) {
                    arrayList.add(new gb(i, i, strGroup2, (byte[]) null));
                } else if (strGroup.equals("-")) {
                    arrayList.add(new gb(Integer.MIN_VALUE, i, strGroup2, (byte[]) null));
                } else if (strGroup.equals("+")) {
                    arrayList.add(new gb(i, ActivityChooserView.ActivityChooserViewAdapter.MAX_ACTIVITY_COUNT_UNLIMITED, strGroup2, (byte[]) null));
                } else {
                    arrayList.add(new gb(i, Integer.parseInt(strGroup.substring(1)), strGroup2, (byte[]) null));
                }
            }
        }
        lfwVar = new lfw(arrayList);
        this.d.put(str, lfwVar);
        return lfwVar;
    }

    @Override // defpackage.lfk
    public final float a(String str, float f) {
        lfw lfwVarF = f(str);
        return lfwVarF != null ? ksh.a(lfwVarF.a(this.a), f) : this.b.a(str, f);
    }

    @Override // defpackage.lfk
    public final int b(String str, int i) {
        lfw lfwVarF = f(str);
        return lfwVarF != null ? ksh.b(lfwVarF.a(this.a), i) : this.b.b(str, i);
    }

    @Override // defpackage.lfk
    public final long c(String str, long j) {
        lfw lfwVarF = f(str);
        if (lfwVarF == null) {
            return this.b.c(str, j);
        }
        String strA = lfwVarF.a(this.a);
        Pattern pattern = ksh.a;
        if (strA != null) {
            try {
                return Long.parseLong(strA);
            } catch (NumberFormatException unused) {
            }
        }
        return j;
    }

    @Override // defpackage.lfk
    public final String d(String str, String str2) {
        lfw lfwVarF = f(str);
        if (lfwVarF == null) {
            return this.b.d(str, str2);
        }
        String strA = lfwVarF.a(this.a);
        return strA != null ? strA : str2;
    }

    @Override // defpackage.lfk
    public final boolean e(String str, boolean z) {
        lfw lfwVarF = f(str);
        if (lfwVarF == null) {
            return this.b.e(str, z);
        }
        String strA = lfwVarF.a(this.a);
        Pattern pattern = ksh.a;
        if (!TextUtils.isEmpty(strA)) {
            if (ksh.a.matcher(strA).matches()) {
                return true;
            }
            if (ksh.b.matcher(strA).matches()) {
                return false;
            }
            krd.f("Failed to parse boolean from: ".concat(String.valueOf(strA)));
        }
        return z;
    }
}

package defpackage;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class fdx {
    private static final Pattern c = Pattern.compile("^ [0-9a-fA-F]{8} ([0-9a-fA-F]{8}) ([0-9a-fA-F]{8})");
    public int a = -1;
    public int b = -1;

    private final boolean c(String str) throws NumberFormatException {
        Matcher matcher = c.matcher(str);
        if (!matcher.find()) {
            return false;
        }
        try {
            String strGroup = matcher.group(1);
            String str2 = edt.a;
            int i = Integer.parseInt(strGroup, 16);
            int i2 = Integer.parseInt(matcher.group(2), 16);
            if (i <= 0 && i2 <= 0) {
                return false;
            }
            this.a = i;
            this.b = i2;
            return true;
        } catch (NumberFormatException unused) {
            return false;
        }
    }

    public final boolean a() {
        return (this.a == -1 || this.b == -1) ? false : true;
    }

    public final void b(ead eadVar) {
        for (int i = 0; i < eadVar.a(); i++) {
            eac eacVarB = eadVar.b(i);
            if (eacVarB instanceof fgf) {
                fgf fgfVar = (fgf) eacVarB;
                if ("iTunSMPB".equals(fgfVar.b) && c(fgfVar.c)) {
                    return;
                }
            } else if (eacVarB instanceof fgk) {
                fgk fgkVar = (fgk) eacVarB;
                if ("com.apple.iTunes".equals(fgkVar.a) && "iTunSMPB".equals(fgkVar.b) && c(fgkVar.c)) {
                    return;
                }
            } else {
                continue;
            }
        }
    }
}

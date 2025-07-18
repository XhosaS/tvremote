package defpackage;

import java.nio.charset.StandardCharsets;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java.util.Map;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class fkd implements fji {
    private static final Pattern a = Pattern.compile("(?:(\\d+):)?(\\d+):(\\d+)[:.](\\d+)");
    private final boolean b;
    private final fkc c;
    private final edi d;
    private Map e;
    private float f;
    private float g;

    public fkd() {
        this(null);
    }

    private static float e(int i) {
        if (i == 0) {
            return 0.05f;
        }
        if (i != 1) {
            return i != 2 ? -3.4028235E38f : 0.95f;
        }
        return 0.5f;
    }

    private static int f(long j, List list, List list2) {
        int i;
        int size = list.size();
        while (true) {
            size--;
            if (size < 0) {
                i = 0;
                break;
            }
            if (((Long) list.get(size)).longValue() == j) {
                return size;
            }
            if (((Long) list.get(size)).longValue() < j) {
                i = size + 1;
                break;
            }
        }
        list.add(i, Long.valueOf(j));
        list2.add(i, i == 0 ? new ArrayList() : new ArrayList((Collection) list2.get(i - 1)));
        return i;
    }

    private static long g(String str) {
        Matcher matcher = a.matcher(str.trim());
        if (!matcher.matches()) {
            return -9223372036854775807L;
        }
        String strGroup = matcher.group(1);
        String str2 = edt.a;
        long j = Long.parseLong(strGroup) * 3600000000L;
        long j2 = Long.parseLong(matcher.group(2)) * 60000000;
        return j + j2 + (Long.parseLong(matcher.group(3)) * 1000000) + (Long.parseLong(matcher.group(4)) * 10000);
    }

    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue
    java.lang.NullPointerException: Cannot invoke "java.util.List.iterator()" because the return value of "jadx.core.dex.visitors.regions.SwitchOverStringVisitor$SwitchData.getNewCases()" is null
    	at jadx.core.dex.visitors.regions.SwitchOverStringVisitor.restoreSwitchOverString(SwitchOverStringVisitor.java:109)
    	at jadx.core.dex.visitors.regions.SwitchOverStringVisitor.visitRegion(SwitchOverStringVisitor.java:66)
    	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseIterativeStepInternal(DepthRegionTraversal.java:77)
    	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseIterativeStepInternal(DepthRegionTraversal.java:82)
     */
    /* JADX WARN: Removed duplicated region for block: B:143:0x0285  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private final void h(defpackage.edi r28, java.nio.charset.Charset r29) throws java.lang.NumberFormatException {
        /*
            Method dump skipped, instructions count: 734
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.fkd.h(edi, java.nio.charset.Charset):void");
    }

    @Override // defpackage.fji
    public final int a() {
        return 1;
    }

    @Override // defpackage.fji
    public final /* synthetic */ fix b(byte[] bArr, int i, int i2) {
        return fki.a(this, bArr, i2);
    }

    /* JADX WARN: Can't wrap try/catch for region: R(15:46|194|47|48|(2:186|49)|(2:(4:52|53|188|54)(1:55)|56)(2:57|(1:59)(8:62|(1:64)|190|67|(1:69)(1:71)|72|(2:74|205)(2:75|204)|76))|60|(0)|190|67|(0)(0)|72|(0)(0)|76|44) */
    /* JADX WARN: Removed duplicated region for block: B:107:0x027a  */
    /* JADX WARN: Removed duplicated region for block: B:110:0x0280  */
    /* JADX WARN: Removed duplicated region for block: B:111:0x0282  */
    /* JADX WARN: Removed duplicated region for block: B:116:0x028d  */
    /* JADX WARN: Removed duplicated region for block: B:117:0x0295  */
    /* JADX WARN: Removed duplicated region for block: B:118:0x0298  */
    /* JADX WARN: Removed duplicated region for block: B:119:0x029b  */
    /* JADX WARN: Removed duplicated region for block: B:120:0x029e A[FALL_THROUGH] */
    /* JADX WARN: Removed duplicated region for block: B:123:0x02a6  */
    /* JADX WARN: Removed duplicated region for block: B:124:0x02ae  */
    /* JADX WARN: Removed duplicated region for block: B:125:0x02b0  */
    /* JADX WARN: Removed duplicated region for block: B:126:0x02b2  */
    /* JADX WARN: Removed duplicated region for block: B:127:0x02b4 A[FALL_THROUGH] */
    /* JADX WARN: Removed duplicated region for block: B:130:0x02ba  */
    /* JADX WARN: Removed duplicated region for block: B:131:0x02c2  */
    /* JADX WARN: Removed duplicated region for block: B:132:0x02c4  */
    /* JADX WARN: Removed duplicated region for block: B:133:0x02c6  */
    /* JADX WARN: Removed duplicated region for block: B:134:0x02c8 A[FALL_THROUGH] */
    /* JADX WARN: Removed duplicated region for block: B:142:0x02e2  */
    /* JADX WARN: Removed duplicated region for block: B:145:0x0302 A[LOOP:2: B:144:0x0300->B:145:0x0302, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:166:0x036d  */
    /* JADX WARN: Removed duplicated region for block: B:207:0x03a2 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:30:0x00af  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x00b8  */
    /* JADX WARN: Removed duplicated region for block: B:46:0x00fd  */
    /* JADX WARN: Removed duplicated region for block: B:64:0x0175  */
    /* JADX WARN: Removed duplicated region for block: B:69:0x018a A[Catch: RuntimeException -> 0x019f, TRY_LEAVE, TryCatch #2 {RuntimeException -> 0x019f, blocks: (B:67:0x017e, B:69:0x018a), top: B:190:0x017e }] */
    /* JADX WARN: Removed duplicated region for block: B:71:0x0197  */
    /* JADX WARN: Removed duplicated region for block: B:74:0x019b  */
    /* JADX WARN: Removed duplicated region for block: B:75:0x019f  */
    /* JADX WARN: Removed duplicated region for block: B:79:0x01de  */
    @Override // defpackage.fji
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void c(byte[] r27, int r28, int r29, defpackage.fjh r30, defpackage.ecq r31) throws java.lang.NumberFormatException {
        /*
            Method dump skipped, instructions count: 1038
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.fkd.c(byte[], int, int, fjh, ecq):void");
    }

    public fkd(List list) throws NumberFormatException {
        this.f = -3.4028235E38f;
        this.g = -3.4028235E38f;
        this.d = new edi();
        if (list == null || list.isEmpty()) {
            this.b = false;
            this.c = null;
            return;
        }
        this.b = true;
        String strS = edt.S((byte[]) list.get(0));
        a.H(strS.startsWith("Format:"));
        fkc fkcVarA = fkc.a(strS);
        fkcVarA.getClass();
        this.c = fkcVarA;
        h(new edi((byte[]) list.get(1)), StandardCharsets.UTF_8);
    }

    @Override // defpackage.fji
    public final /* synthetic */ void d() {
    }
}

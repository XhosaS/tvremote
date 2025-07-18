package defpackage;

import java.text.BreakIterator;
import java.util.Iterator;
import java.util.List;
import java.util.NoSuchElementException;
import java.util.PriorityQueue;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class cku implements cgl {
    public final chc a;
    public final ckw b;
    public final CharSequence c;
    public final chl d;
    public final int e;
    public cvi f;
    public final esn g;
    private final String h;
    private final List i;
    private final List j;
    private final clx k;
    private final boolean l;

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:10:0x005b  */
    /* JADX WARN: Removed duplicated region for block: B:130:0x02a6  */
    /* JADX WARN: Removed duplicated region for block: B:133:0x02ad  */
    /* JADX WARN: Removed duplicated region for block: B:136:0x02b4  */
    /* JADX WARN: Removed duplicated region for block: B:137:0x02b7  */
    /* JADX WARN: Removed duplicated region for block: B:139:0x02bb  */
    /* JADX WARN: Removed duplicated region for block: B:140:0x02be  */
    /* JADX WARN: Removed duplicated region for block: B:143:0x02d8  */
    /* JADX WARN: Removed duplicated region for block: B:149:0x0307  */
    /* JADX WARN: Removed duplicated region for block: B:152:0x0321  */
    /* JADX WARN: Removed duplicated region for block: B:159:0x0341  */
    /* JADX WARN: Removed duplicated region for block: B:161:0x0354  */
    /* JADX WARN: Removed duplicated region for block: B:164:0x0364  */
    /* JADX WARN: Removed duplicated region for block: B:167:0x0378  */
    /* JADX WARN: Removed duplicated region for block: B:171:0x039a  */
    /* JADX WARN: Removed duplicated region for block: B:177:0x03b6  */
    /* JADX WARN: Removed duplicated region for block: B:192:0x0401  */
    /* JADX WARN: Removed duplicated region for block: B:206:0x0445  */
    /* JADX WARN: Removed duplicated region for block: B:207:0x044c  */
    /* JADX WARN: Removed duplicated region for block: B:213:0x0471  */
    /* JADX WARN: Removed duplicated region for block: B:214:0x0478  */
    /* JADX WARN: Removed duplicated region for block: B:221:0x04b7  */
    /* JADX WARN: Removed duplicated region for block: B:235:0x04f0  */
    /* JADX WARN: Removed duplicated region for block: B:238:0x0521  */
    /* JADX WARN: Removed duplicated region for block: B:242:0x0555  */
    /* JADX WARN: Removed duplicated region for block: B:268:0x05ef  */
    /* JADX WARN: Removed duplicated region for block: B:303:0x06e2  */
    /* JADX WARN: Removed duplicated region for block: B:308:0x06f6  */
    /* JADX WARN: Removed duplicated region for block: B:332:0x0762  */
    /* JADX WARN: Removed duplicated region for block: B:340:0x0790  */
    /* JADX WARN: Removed duplicated region for block: B:356:0x07cc  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0052  */
    /* JADX WARN: Type inference failed for: r1v20, types: [android.text.Spannable] */
    /* JADX WARN: Type inference failed for: r30v2 */
    /* JADX WARN: Type inference failed for: r30v3, types: [boolean] */
    /* JADX WARN: Type inference failed for: r30v4 */
    /* JADX WARN: Type inference failed for: r31v1 */
    /* JADX WARN: Type inference failed for: r31v2, types: [boolean] */
    /* JADX WARN: Type inference failed for: r31v3 */
    /* JADX WARN: Type inference failed for: r3v15, types: [java.util.ArrayList] */
    /* JADX WARN: Type inference failed for: r3v7, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r3v8, types: [java.util.Collection, java.util.List] */
    /* JADX WARN: Type inference failed for: r44v5, types: [java.lang.Throwable] */
    /* JADX WARN: Type inference failed for: r44v7 */
    /* JADX WARN: Type inference failed for: r44v9 */
    /* JADX WARN: Type inference failed for: r8v17 */
    /* JADX WARN: Type inference failed for: r8v18 */
    /* JADX WARN: Type inference failed for: r8v21 */
    /* JADX WARN: Type inference failed for: r8v22, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r8v46 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public cku(java.lang.String r42, defpackage.chc r43, java.util.List r44, java.util.List r45, defpackage.esn r46, defpackage.clx r47) {
        /*
            Method dump skipped, instructions count: 2048
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.cku.<init>(java.lang.String, chc, java.util.List, java.util.List, esn, clx):void");
    }

    @Override // defpackage.cgl
    public final float a() {
        return this.d.b();
    }

    @Override // defpackage.cgl
    public final float b() {
        float f;
        chl chlVar = this.d;
        if (!Float.isNaN(chlVar.c)) {
            return chlVar.c;
        }
        BreakIterator lineInstance = BreakIterator.getLineInstance(chlVar.b.getTextLocale());
        CharSequence charSequence = chlVar.a;
        lineInstance.setText(new chg(charSequence, charSequence.length()));
        PriorityQueue priorityQueue = new PriorityQueue(10, new ade(8));
        int i = 0;
        for (int next = lineInstance.next(); next != -1; next = lineInstance.next()) {
            if (priorityQueue.size() < 10) {
                priorityQueue.add(new yfw(Integer.valueOf(i), Integer.valueOf(next)));
            } else {
                yfw yfwVar = (yfw) priorityQueue.peek();
                if (yfwVar != null && ((Number) yfwVar.b).intValue() - ((Number) yfwVar.a).intValue() < next - i) {
                    priorityQueue.poll();
                    priorityQueue.add(new yfw(Integer.valueOf(i), Integer.valueOf(next)));
                }
            }
            i = next;
        }
        if (priorityQueue.isEmpty()) {
            f = 0.0f;
        } else {
            Iterator it = priorityQueue.iterator();
            if (!it.hasNext()) {
                throw new NoSuchElementException();
            }
            yfw yfwVar2 = (yfw) it.next();
            float fA = chlVar.a(((Number) yfwVar2.a).intValue(), ((Number) yfwVar2.b).intValue());
            while (it.hasNext()) {
                yfw yfwVar3 = (yfw) it.next();
                fA = Math.max(fA, chlVar.a(((Number) yfwVar3.a).intValue(), ((Number) yfwVar3.b).intValue()));
            }
            f = fA;
        }
        chlVar.c = f;
        return f;
    }

    @Override // defpackage.cgl
    public final boolean c() {
        cvi cviVar = this.f;
        if (cviVar != null && cviVar.k()) {
            return true;
        }
        if (!cko.w(this.a)) {
            return false;
        }
        int i = ckz.a;
        ((Boolean) ckz.a().a()).booleanValue();
        return false;
    }
}

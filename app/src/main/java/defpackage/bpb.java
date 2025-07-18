package defpackage;

import java.util.ListIterator;

/* compiled from: PG */
/* loaded from: classes.dex */
public final /* synthetic */ class bpb {
    public static final void a(bsk bskVar) throws Exception {
        agrx agrxVar = new agrx(10);
        brj brjVarA = bskVar.a("SELECT name FROM sqlite_master WHERE type = 'trigger'");
        while (brjVarA.l()) {
            try {
                agrxVar.add(brjVarA.d(0));
            } finally {
            }
        }
        aguj.a(brjVarA, null);
        ListIterator listIterator = ((agrx) agqq.a(agrxVar)).listIterator(0);
        while (listIterator.hasNext()) {
            String str = (String) listIterator.next();
            str.getClass();
            if (str.startsWith("room_fts_content_sync_")) {
                bri.a(bskVar, "DROP TRIGGER IF EXISTS ".concat(String.valueOf(str)));
            }
        }
    }
}

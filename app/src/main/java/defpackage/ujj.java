package defpackage;

import com.google.protobuf.MessageLite;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.Executor;
import java.util.concurrent.Future;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class ujj implements zvi {
    public final List a;
    public final Executor b;

    public ujj(List list, Executor executor) {
        this.a = list;
        this.b = executor;
    }

    @Override // defpackage.zvi
    public final /* synthetic */ zyd a(Object obj) {
        List list = this.a;
        final int i = ((zcg) list).d;
        final unj unjVar = (unj) obj;
        final ArrayList arrayList = new ArrayList(i);
        zdm zdmVarListIterator = ((yyk) list).listIterator(0);
        while (zdmVarListIterator.hasNext()) {
            arrayList.add(((uje) zdmVarListIterator.next()).c());
        }
        final zvi zviVarC = wyo.c(new zvi() { // from class: ujh
            @Override // defpackage.zvi
            public final zyd a(Object obj2) {
                final List list2 = arrayList;
                final MessageLite messageLite = (MessageLite) obj2;
                zxj zxjVarA = zxn.a(list2);
                final ujj ujjVar = this.a;
                final int i2 = i;
                return zxjVarA.b(wyo.b(new zvh() { // from class: ujg
                    @Override // defpackage.zvh
                    public final zyd a() {
                        zyd zydVarH = zxn.h(messageLite);
                        for (int i3 = 0; i3 < i2; i3++) {
                            if (((Boolean) zxn.o((Future) list2.get(i3))).booleanValue()) {
                                final uje ujeVar = (uje) ujjVar.a.get(i3);
                                zydVarH = zuz.h(zydVarH, wyo.c(new zvi() { // from class: ujf
                                    @Override // defpackage.zvi
                                    public final zyd a(Object obj3) {
                                        return ujeVar.b((MessageLite) obj3);
                                    }
                                }), zwk.a);
                            }
                        }
                        return zydVarH;
                    }
                }), ujjVar.b);
            }
        });
        unk unkVar = unjVar.a;
        wuw wuwVar = unkVar.e;
        final zwk zwkVar = zwk.a;
        wuwVar.a();
        return zuz.h(uno.a(zuz.h(zxn.i(unkVar.c.b()), wyo.c(new zvi() { // from class: uni
            @Override // defpackage.zvi
            public final zyd a(Object obj2) {
                return unjVar.a.b.h(zviVarC, zwkVar, null);
            }
        }), zwkVar)), wyo.c(new zvi() { // from class: uji
            @Override // defpackage.zvi
            public final zyd a(Object obj2) {
                int i2 = i;
                ArrayList arrayList2 = new ArrayList(i2);
                for (int i3 = 0; i3 < i2; i3++) {
                    if (((Boolean) zxn.o((Future) arrayList.get(i3))).booleanValue()) {
                        arrayList2.add(((uje) this.a.a.get(i3)).a());
                    }
                }
                return zxn.c(arrayList2).a(new zvk(), zwk.a);
            }
        }), zwkVar);
    }
}

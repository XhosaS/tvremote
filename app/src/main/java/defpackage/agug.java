package defpackage;

import java.io.File;
import java.util.ArrayDeque;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class agug extends agpy {
    final /* synthetic */ agui c;
    private final ArrayDeque d;

    public agug(agui aguiVar) {
        this.c = aguiVar;
        ArrayDeque arrayDeque = new ArrayDeque();
        this.d = arrayDeque;
        if (aguiVar.a.isDirectory()) {
            arrayDeque.push(new ague(aguiVar.a));
        } else if (aguiVar.a.isFile()) {
            arrayDeque.push(new aguf(aguiVar.a));
        } else {
            this.a = 2;
        }
    }

    @Override // defpackage.agpy
    protected final void a() {
        File file;
        int i;
        File fileA;
        while (true) {
            ArrayDeque arrayDeque = this.d;
            aguh aguhVar = (aguh) arrayDeque.peek();
            if (aguhVar == null) {
                file = null;
                break;
            }
            fileA = aguhVar.a();
            if (fileA == null) {
                arrayDeque.pop();
            } else if (agvy.c(fileA, aguhVar.a) || !fileA.isDirectory() || arrayDeque.size() >= Integer.MAX_VALUE) {
                break;
            } else {
                arrayDeque.push(new ague(fileA));
            }
        }
        file = fileA;
        if (file != null) {
            this.b = file;
            i = 1;
        } else {
            i = 2;
        }
        this.a = i;
    }
}

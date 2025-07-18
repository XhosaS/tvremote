package defpackage;

import java.io.PrintWriter;

/* compiled from: PG */
/* loaded from: classes.dex */
public class bfg extends beb {
    public static final beg a = new bff();
    public final wy b = new wy(10);
    public boolean c = false;

    public final void a(String str, PrintWriter printWriter) {
        wy wyVar = this.b;
        if (wyVar.c() > 0) {
            printWriter.print(str);
            printWriter.println("Loaders:");
            for (int i = 0; i < wyVar.c(); i++) {
                String strConcat = str.concat("    ");
                bfd bfdVar = (bfd) wyVar.d(i);
                printWriter.print(str);
                printWriter.print("  #");
                printWriter.print(wyVar.b(i));
                printWriter.print(": ");
                printWriter.println(bfdVar.toString());
                printWriter.print(strConcat);
                printWriter.print("mId=");
                printWriter.print(bfdVar.j);
                printWriter.print(" mArgs=");
                printWriter.println((Object) null);
                printWriter.print(strConcat);
                printWriter.print("mLoader=");
                bfk bfkVar = bfdVar.k;
                printWriter.println(bfkVar);
                String strConcat2 = strConcat.concat("  ");
                printWriter.print(strConcat2);
                printWriter.print("mId=");
                printWriter.print(bfkVar.c);
                printWriter.print(" mListener=");
                printWriter.println(bfkVar.i);
                if (bfkVar.e || bfkVar.h) {
                    printWriter.print(strConcat2);
                    printWriter.print("mStarted=");
                    printWriter.print(bfkVar.e);
                    printWriter.print(" mContentChanged=");
                    printWriter.print(bfkVar.h);
                    printWriter.print(" mProcessingChange=");
                    printWriter.println(false);
                }
                if (bfkVar.f || bfkVar.g) {
                    printWriter.print(strConcat2);
                    printWriter.print("mAbandoned=");
                    printWriter.print(bfkVar.f);
                    printWriter.print(" mReset=");
                    printWriter.println(bfkVar.g);
                }
                bfj bfjVar = (bfj) bfkVar;
                if (bfjVar.a != null) {
                    printWriter.print(strConcat2);
                    printWriter.print("mTask=");
                    printWriter.print(bfjVar.a);
                    printWriter.print(" waiting=");
                    boolean z = bfjVar.a.a;
                    printWriter.println(false);
                }
                if (bfjVar.b != null) {
                    printWriter.print(strConcat2);
                    printWriter.print("mCancellingTask=");
                    printWriter.print(bfjVar.b);
                    printWriter.print(" waiting=");
                    boolean z2 = bfjVar.b.a;
                    printWriter.println(false);
                }
                if (bfdVar.l != null) {
                    printWriter.print(strConcat);
                    printWriter.print("mCallbacks=");
                    printWriter.println(bfdVar.l);
                    bfe bfeVar = bfdVar.l;
                    printWriter.print(strConcat.concat("  "));
                    printWriter.print("mDeliveredData=");
                    printWriter.println(bfeVar.c);
                }
                printWriter.print(strConcat);
                printWriter.print("mData=");
                Object obj = bfdVar.f;
                printWriter.println(bfkVar.d(obj != bcw.a ? obj : null));
                printWriter.print(strConcat);
                printWriter.print("mStarted=");
                printWriter.println(bfdVar.d > 0);
            }
        }
    }

    public final bfd b() {
        return (bfd) wz.a(this.b, 54321);
    }

    @Override // defpackage.beb
    protected final void c() {
        wy wyVar = this.b;
        int iC = wyVar.c();
        for (int i = 0; i < iC; i++) {
            ((bfd) wyVar.d(i)).j();
        }
        wyVar.e();
    }
}

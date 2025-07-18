package defpackage;

import android.support.rastermill.FrameSequenceDrawable;
import com.google.protos.youtube.elements.CommandOuterClass$Command;
import java.nio.ByteBuffer;

/* compiled from: PG */
/* loaded from: classes.dex */
public class ogf {
    public final CommandOuterClass$Command a;
    public FrameSequenceDrawable b;
    public dlz c;
    public final oaa d;
    private final CommandOuterClass$Command e;
    private final Object f;

    public ogf(CommandOuterClass$Command commandOuterClass$Command, CommandOuterClass$Command commandOuterClass$Command2, oaa oaaVar, Object obj) {
        this.a = commandOuterClass$Command;
        this.e = commandOuterClass$Command2;
        this.d = oaaVar;
        this.f = obj;
    }

    public final void a() {
        CommandOuterClass$Command commandOuterClass$Command = this.e;
        if (commandOuterClass$Command == null) {
            return;
        }
        this.d.a(commandOuterClass$Command, null).k();
    }

    public final void b() {
        FrameSequenceDrawable frameSequenceDrawable = this.b;
        if (frameSequenceDrawable != null) {
            frameSequenceDrawable.stop();
            return;
        }
        dlz dlzVar = this.c;
        if (dlzVar != null) {
            dlzVar.stop();
        }
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof ogf)) {
            return false;
        }
        ogf ogfVar = (ogf) obj;
        Object obj2 = this.f;
        if (obj2 instanceof aarv) {
            Object obj3 = ogfVar.f;
            if (obj3 instanceof aarv) {
                aarv aarvVar = (aarv) obj2;
                aarv aarvVar2 = (aarv) obj3;
                if (aarvVar == null && aarvVar2 == null) {
                    return true;
                }
                if (aarvVar == null || aarvVar2 == null) {
                    return false;
                }
                ByteBuffer byteBuffer = aarvVar.b;
                ByteBuffer byteBuffer2 = aarvVar2.b;
                if (byteBuffer == null && byteBuffer2 == null) {
                    return true;
                }
                if (byteBuffer == null || byteBuffer2 == null) {
                    return false;
                }
                if (byteBuffer.hasArray() && byteBuffer2.hasArray() && byteBuffer.arrayOffset() == byteBuffer2.arrayOffset() && byteBuffer.capacity() == byteBuffer2.capacity() && byteBuffer.position() == byteBuffer2.position() && byteBuffer.remaining() == byteBuffer2.remaining() && byteBuffer.array() == byteBuffer2.array()) {
                    return true;
                }
                return aarvVar.b.equals(aarvVar2.b);
            }
        }
        return obj2.equals(ogfVar.f);
    }

    public final int hashCode() {
        return this.f.hashCode();
    }
}

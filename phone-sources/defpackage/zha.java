package defpackage;

import j$.nio.file.Files;
import j$.nio.file.LinkOption;
import j$.nio.file.Path;
import j$.nio.file.StandardCopyOption;
import j$.nio.file.attribute.BasicFileAttributes;
import j$.nio.file.attribute.FileTime;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.nio.file.FileSystemException;
import java.nio.file.NoSuchFileException;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class zha extends zgz {
    protected static final zgq m(Path path) {
        zhe zheVarAz;
        try {
            BasicFileAttributes attributes = Files.readAttributes(path, BasicFileAttributes.class, LinkOption.NOFOLLOW_LINKS);
            Path symbolicLink = attributes.isSymbolicLink() ? Files.readSymbolicLink(path) : null;
            boolean zIsRegularFile = attributes.isRegularFile();
            boolean zIsDirectory = attributes.isDirectory();
            if (symbolicLink != null) {
                String str = zhe.a;
                zheVarAz = wcq.az(symbolicLink.toString());
            } else {
                zheVarAz = null;
            }
            Long lValueOf = Long.valueOf(attributes.size());
            FileTime fileTimeCreationTime = attributes.creationTime();
            Long lN = fileTimeCreationTime != null ? n(fileTimeCreationTime) : null;
            FileTime fileTimeLastModifiedTime = attributes.lastModifiedTime();
            Long lN2 = fileTimeLastModifiedTime != null ? n(fileTimeLastModifiedTime) : null;
            FileTime fileTimeLastAccessTime = attributes.lastAccessTime();
            return new zgq(zIsRegularFile, zIsDirectory, zheVarAz, lValueOf, lN, lN2, fileTimeLastAccessTime != null ? n(fileTimeLastAccessTime) : null);
        } catch (NoSuchFileException | FileSystemException unused) {
            return null;
        }
    }

    private static final Long n(FileTime fileTime) {
        Long lValueOf = Long.valueOf(fileTime.toMillis());
        if (lValueOf.longValue() != 0) {
            return lValueOf;
        }
        return null;
    }

    @Override // defpackage.zgz, defpackage.zgr
    public final zgq e(zhe zheVar) {
        return m(zheVar.a());
    }

    @Override // defpackage.zgz, defpackage.zgr
    public final void g(zhe zheVar, zhe zheVar2) throws IOException {
        try {
            Files.move(zheVar.a(), zheVar2.a(), StandardCopyOption.ATOMIC_MOVE, StandardCopyOption.REPLACE_EXISTING);
        } catch (UnsupportedOperationException unused) {
            throw new IOException("atomic move not supported");
        } catch (NoSuchFileException e) {
            throw new FileNotFoundException(e.getMessage());
        }
    }

    @Override // defpackage.zgz
    public final String toString() {
        return "NioSystemFileSystem";
    }
}

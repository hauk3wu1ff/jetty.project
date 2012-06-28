package org.eclipse.jetty.websocket.api;

import java.io.IOException;
import java.net.InetSocketAddress;
import java.nio.ByteBuffer;

import org.eclipse.jetty.util.Callback;
import org.eclipse.jetty.websocket.frames.BaseFrame;
import org.junit.rules.TestName;

public class LocalWebSocketConnection implements WebSocketConnection
{
    private final String id;

    public LocalWebSocketConnection()
    {
        this("anon");
    }

    public LocalWebSocketConnection(String id)
    {
        this.id = id;
    }

    public LocalWebSocketConnection(TestName testname)
    {
        this.id = testname.getMethodName();
    }

    @Override
    public void close()
    {
    }

    @Override
    public void close(int statusCode, String reason)
    {
    }

    @Override
    public WebSocketPolicy getPolicy()
    {
        return null;
    }

    @Override
    public InetSocketAddress getRemoteAddress()
    {
        return null;
    }

    @Override
    public String getSubProtocol()
    {
        return null;
    }

    @Override
    public boolean isOpen()
    {
        return false;
    }

    @Override
    public String toString()
    {
        return String.format("LocalWebSocketConnection[%s]",id);
    }

    @Override
    public void write(BaseFrame frame) throws IOException
    {
    }

    @Override
    public void write(byte[] data, int offset, int length) throws IOException
    {
    }

    @Override
    public void write(ByteBuffer... buffers) throws IOException
    {
    }

    @Override
    public <C> void write(C context, Callback<C> callback, BaseFrame... frames) throws IOException
    {
    }

    @Override
    public <C> void write(C context, Callback<C> callback, ByteBuffer... buffers) throws IOException
    {
    }

    @Override
    public <C> void write(C context, Callback<C> callback, String... messages) throws IOException
    {
    }

    @Override
    public void write(String message) throws IOException
    {
    }
}

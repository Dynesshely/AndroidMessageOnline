namespace AndroidMessageOnlineServer.Data
{
    public class SMSMessageService
    {

        public Task<SMSMessage[]> GetSMSMessages()
        {
            return Task.FromResult(new SMSMessage[]
            {
                new SMSMessage()
                {
                    SendDate = DateTime.Now,
                    ID = 001,
                    Sender = "me",
                    Content = "Hello, world!"
                }
            });
        }
    }
}
